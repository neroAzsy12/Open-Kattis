#include <iostream>
#include <string>
using namespace std;

int main() {
  string text;        // declare a string
  getline(cin, text); // get input of the entire line including whitespaces

  int count = 0;      // num of days to change the cipher text to a string containing only Per’s name

  for (int i = 0; i < text.length(); i += 3) {
    if (text.at(i) != 'P') {
      count++;
    }
    if (text.at(i + 1) != 'E') {
      count++;
    }
    if (text.at(i + 2) != 'R') {
      count++;
    }
  }
  cout << count << endl;
}