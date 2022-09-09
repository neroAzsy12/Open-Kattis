#include <iostream>
using namespace std;

int main() {
  double k, r;
  cin >> k >> r;

  double min = 0;
  double max = 0;

  for (int i = 0; i < r; i++) {
    double j;
    cin >> j;
    min += j;
    max += j;
  }

  min += ( (k - r) * -3);
  max += ( (k - r) * 3);

  cout << min/k << " " << max/k << endl;
}