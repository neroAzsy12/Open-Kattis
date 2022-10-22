from bs4 import BeautifulSoup
import os
import requests

directories_to_access = [         # List of Directories that need to be accessed
  '../C++',
  '../Java', 
  '../Python'
]
extension_map = {                 # Mapping of respective file extensions
  'Python': 'py', 
  'C++': 'cpp', 
  'Java': 'java'
}
language_map = {                  # Mapping of respective language solution
  'py' : 'Python', 
  'cpp' : "C++", 
  'java' : 'Java'
}
open_kattis_url = 'https://open.kattis.com/problems'
problem_data_map = None           # Key: Problem Id, Value: { name, difficulty: (Easy || Medium || hard), time: TC, solutions: [], space: SC, approach: subsection }

# first get all problem ids
def getCodingSolutionsContent():
  """
    Opens the Coding Solutions file, and obtains the following info for each problem:\n
    key: problemId ex) costumecontest
    value: {\n
      difficulty: (Easy, Medium, Hard),\n
      explanation: Yes/No\n 
      name: ex) Costume Contest,\n
      solutions: [],\n
    }\n
  """
  file = open('../CodingSolutions.md', 'r')
  content_lines = file.read().splitlines()
  startIndex = 2
  result = {}

  for index in range(startIndex, len(content_lines)):
    currentLine = content_lines[index].split('|')
    
    result[currentLine[1]] = {
      'name' : currentLine[0],                # name of the problem
      'difficulty' : currentLine[2],          # should only be (Easy, Medium or Hard)
      'solutions' : currentLine[3].split(','),# ex) [C++, Go, Java, JavaScript, Python]
      'explanation' : currentLine[4]          # ex) 'Y' for Yes or 'N' for No
    }

  file.close()
  return result

def getProblemDataFromKattis(url, problemId):
  open_kattis_problem_url = '{kattis_url}/{id}'.format(
    kattis_url = url,
    id = problemId
  )

  reqs = requests.get(open_kattis_problem_url)
  soup = BeautifulSoup(reqs.text, 'html.parser')

  problem_difficulty_data = soup.find(class_ = 'difficulty_number').get_attribute_list('class')
  problem_name = soup.find(class_ = 'book-page-heading').get_text()
  
  problem_difficulty = ''

  if problem_difficulty_data[-1] == 'difficulty_easy':
    problem_difficulty = 'Easy'
  elif problem_difficulty_data[-1] == 'difficulty_medium':
    problem_difficulty = 'Medium'
  else:
    problem_difficulty = 'Hard'
  
  return [problem_name, problem_difficulty]
  
def getDataFromDirectories(directories, data_map, file_extension_map, url):
  """
  directories: problem_data_map\n
  data_map: problem_data_map\n
  file_extension_map: language_map\n
  """

  for directory in directories:
    files = os.listdir(directory)

    for file in files:
      separator = file.split('.')

      problemId = separator[0]
      file_extension = file_extension_map[separator[-1]]

      if problemId not in data_map:
        problem_data = getProblemDataFromKattis(url, problemId)

        data_map[problemId] = {

          'name' : problem_data[0],
          'difficulty' : problem_data[1],
          'solutions' : [file_extension],
          'explanation' : 'N'
        }
      elif problemId in data_map and file_extension not in data_map[problemId]['solutions']:
        data_map[problemId]['solutions'].append(file_extension)
        data_map[problemId]['solutions'].sort()

def writeContentToFiles(data_map, lang_map):
  """
  data_map: sorted_problem_data_map\n
  lang_map: extension_map\n
  """

  readme_file = open('../README.md', 'w')
  readme_file.write('# Open Kattis Solutions\n\n#|Problem|ID|Difficulty|Solution|Explanation\n---|---|---|---|---|---\n')

  solution_file = open('../CodingSolutions.md', 'w')
  solution_file.write('#|Problem|ID|Difficulty|Solution|Explanation\n---|---|---|---|---|---\n')

  for key in data_map:
    problemId = key

    problemNameReadMe = "[{name}]({link}/{link_id})".format(
      name = data_map[key]['name'],
      link = 'https://open.kattis.com/problems',
      link_id = problemId
    )

    difficulty = data_map[key]['difficulty']
    explanation = 'Y' if data_map[key]['explanation'] == 'Y' else 'N'

    readme_solutions = ''
    solution_solutions = ''

    for index in range(len(data_map[key]['solutions'])):
      current_lang_solution = '[{lang}]({link}/{dir}/{file_name}.{extension})'.format(
        lang = data_map[key]['solutions'][index],
        link = 'https://github.com/neroAzsy12/Open-Kattis/blob/main',
        dir = data_map[key]['solutions'][index],
        file_name = problemId,
        extension = lang_map[data_map[key]['solutions'][index]]
      )

      readme_solutions += current_lang_solution
      solution_solutions += data_map[key]['solutions'][index]

      if index != len(data_map[key]['solutions']) - 1:
        readme_solutions += ','
        solution_solutions += ','
    
    readme_file.write(problemNameReadMe + '|' + problemId + '|' + difficulty + '|' + readme_solutions + '|' + explanation + '\n')
    solution_file.write(data_map[key]['name'] + '|' + problemId + '|' + difficulty + '|' + solution_solutions + '|' + explanation + '\n')

  solution_file.close()
  readme_file.close()

# First collect data from CodingSolutions.md, and directories
problem_data_map = getCodingSolutionsContent()
getDataFromDirectories(directories_to_access, problem_data_map, language_map, open_kattis_url)

# update both README and CodingSolutions.md
sorted_problem_data_map = dict(sorted(problem_data_map.items(), key=lambda x:x[1]['name']))
writeContentToFiles(sorted_problem_data_map, extension_map)