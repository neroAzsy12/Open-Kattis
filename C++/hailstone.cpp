#include <iostream>
using namespace std;

int main() {
  long result = 0;
  long num;
  cin >> num;

  while (num != 1) {
    result += num;
    if (num % 2 == 0) {
      num /= 2;
    } else {
      num = (3 * num) + 1;
    } 
  }
  result++;

  cout << result << endl;
}