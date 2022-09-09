#include <iostream>
using namespace std;

int sumOfDigits(int num) {
  int sum = 0;
  while (num != 0) {
    sum += (num % 10);
    num /= 10;        
  }
  return sum;
}

int main() {
  int L, D, X;
  cin >> L >> D >> X; // starting & ending range & target sum

  for (int i = L; i <= D; i++) {
    if (sumOfDigits(i) == X) {
      // print min int whose sum of its digits is X
      cout << i << endl;
      break;
    }
  }

  for (int i = D; i >= L; i--) {
    if (sumOfDigits(i) == X) {
      // print max int whose sum of its digits is X
      cout << i << endl;
      break;
    }
  }
}