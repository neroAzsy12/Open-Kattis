#include <iostream>
#include <cmath>
using namespace std;

int main() {
  int n;
  cin >> n;

  n = (int)pow(2, n) + 1;
  cout << (int)pow(n, 2) << endl;
}