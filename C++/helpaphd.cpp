#include <iostream>
#include <string>
#include <vector>
using namespace std;

vector<string> splitString(string str, char splitter){
  vector<std::string> result;
  string current = ""; 

  for(int i = 0; i < str.size(); i++){
    if(str[i] == splitter){
      if(current != ""){
        result.push_back(current);
        current = "";
      } 
      continue;
    }
    current += str[i];
  }

  if(current.length() != 0)
    result.push_back(current);
  return result;
}

int main() {
  int cases;
  cin >> cases;

  for (int i = 0; i < cases; i++) {
    string s;
    cin >> s;
    
    vector<string> split = splitString(s, '+');

    if (split.size() == 1) {
      cout << "skipped" << endl;
    } else {
      cout << (stoi(split[0]) + stoi(split[1])) << endl;
    }
  }
}