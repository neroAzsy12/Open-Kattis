from sys import stdin
greet = stdin.readline()

num = greet.count('e') * 2
print('h' + (num * 'e') + 'y')