#include <iostream>
#include <string>
using namespace std;

int main() {
  string s;
  cin >> s;

  int e_count = 0;
  for (int i = 0; i < s.length(); i++) {
    if (s[i] == 'e') e_count++;
  }

  string answer = "h" + string(2 * e_count, 'e') + "y";
  cout << answer << endl;
}