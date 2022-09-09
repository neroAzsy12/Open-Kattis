#include <iostream>
using namespace std;

int main() {
  int n;
  cin >> n;

  int totalColdDays = 0;
  for (int i = 0; i < n; i++) {
    int temp;
    cin >> temp;

    if (temp < 0) {
      totalColdDays++;
    }
  }

  printf("%d\n", totalColdDays);
}