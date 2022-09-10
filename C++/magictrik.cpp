#include <iostream>
#include <set>
#include <string>
using namespace std;

int main() {
  set<char> letters;
  string s;
  getline(cin, s);

  for (int i = 0; i < s.length(); i++) {
    letters.insert(s[i]);
  }

  cout << (letters.size() == s.length() ? 1 : 0) << endl;
}