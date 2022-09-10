#include <iostream>
using namespace std;

int main() {
  double cost;
  cin >> cost;

  int lawns;
  cin >> lawns;

  double totalCost = 0;
  for (int i = 0; i < lawns; i++) {
    double l, w;
    cin >> l >> w;
    totalCost += (l * w);
  }

  cout.precision(10);
  cout << fixed << (totalCost * cost) << endl;
}