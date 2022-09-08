#include <iostream>
#include <string>
using namespace std;

int main() {
  int n;
  cin >> n;

  // output the odd-indexed words (1, 3, 5, 7..)
  for (int i = 1; i <= n; i++) {
    string line;
    cin >> line;

    if (i % 2 == 0) continue;
    cout << line << endl;
  }
}
