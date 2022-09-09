#include <iostream>
using namespace std;

int main() {
  int n;  // n = the number of periods of quality of life, 1 <= n <= 100
  cin >> n;

  double sum = 0; // We want the sum of the QALY accumalated by the person
  for(int i = 0; i < n; i++) {
    // q = quality of life in the ith period, 0 < q <= 1
    // y = num of yrs in the ith period, 0 < y <= 100
    double q, y;  
    cin >> q >> y;

    // QALY for each period is the product of (q * y)
    sum += (q * y);
  }
  cout << sum << endl;
}