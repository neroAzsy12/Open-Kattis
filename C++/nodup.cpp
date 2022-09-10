#include <iostream>
#include <set>
#include <string>
using namespace std;

int main() {
  set<string> unique;
  string word;
  int count = 0;

  while (cin >> word) {
    unique.insert(word);
    count++;
  }

  if (unique.size() == count) {
    cout << "yes" << endl;
  } else {
    cout << "no" << endl;
  }
}