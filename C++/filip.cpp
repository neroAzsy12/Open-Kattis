#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;

int main() {
  int a, b;
  cin >> a >> b;

  int ra = 0, rb = 0; // reversed a and b
  for (int i = 0; i < 3; i++) {
    ra += (a % 10) * pow(10, 2 - i);
    rb += (b % 10) * pow(10, 2 - i);

    a /= 10;
    b /= 10;
  }

  cout << max(ra, rb) << endl;
}