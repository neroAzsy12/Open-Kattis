#include <iostream>
using namespace std;

int calculateFactorial(int n) {
  if (n < 2) return 1;
  return n * calculateFactorial(n - 1);
}

int main() {
  int cases;
  cin >> cases;

  for (int i = 0; i < cases; i++) {
    int x;
    cin >> x;

    cout << (x >= 5 ? 0 : calculateFactorial(x) % 10) << endl;
  }
}