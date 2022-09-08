#include <iostream>
#include <string>
using namespace std;

int main() {
  int cases;
  cin >> cases;

  for (int i = 0; i < cases; i++) {
    string line;
    cin >> line;

    bool isSecondDigit = false;
    int sum = 0;
    int length = line.length();

    for (int index = length - 1; index >= 0; index--) {
      int val = line[index] - 48;

      if (isSecondDigit) {
        val *= 2;
      }

      sum += val/10;
      sum += val%10;
      isSecondDigit = !isSecondDigit;
    }

    cout << (sum % 10 == 0 ? "PASS" : "FAIL") << "\n";
  }
}
