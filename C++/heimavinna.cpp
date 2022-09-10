#include <iostream>
#include <string>
using namespace std;

int main() {
  int n = 0, last = 0;
  char input;
  string temp = "";

  while (cin >> input) {
    if (input == '-') {
      last = stoi(temp);
      temp = "";
    } else if (input == ';') {
      if (last) n += stoi(temp) - last;
      n += 1;
      last = 0;
      temp = "";
    } else {
      temp += input;
    }
  }

  n += last ? stoi(temp) - last + 1 : 1;

  cout << n << endl;
}