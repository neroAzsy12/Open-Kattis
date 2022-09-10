#include <iostream>
using namespace std;

int main() {
  int index = 1;
  int answer = 0;

  for (int i = 1; i <= 5; i++) {
    int a1, a2, a3, a4;
    cin >> a1 >> a2 >> a3 >> a4;

    int sum = a1 + a2 + a3 + a4;

    if (answer < sum) {
      index = i;
      answer = sum;
    }
  }

  printf("%d %d\n", index, answer);
}