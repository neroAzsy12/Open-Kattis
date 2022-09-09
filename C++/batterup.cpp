#include <iostream>
using namespace std;

int main() {
  int n;  // num of at-bats;
  cin >> n;

  double numerator = 0;
  double denominator = 0;

  int at_bat; // can have a value of -1, 0, 1, 2, 3, 4

  for (int i = 0; i < n; i++) {
    cin >> at_bat;

    if (at_bat > -1) {
      numerator += at_bat;
      denominator += 1;
    }
  }
  cout << numerator / denominator << endl;
}