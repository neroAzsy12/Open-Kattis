#include <iostream>
using namespace std;

int main() {
  int cases;
  cin >> cases;

  for (int i = 1; i <= cases; i++) {
    int k, n;
    cin >> k >> n;

    cout << k << " " << ((n * (n + 1) / 2) + n) << endl;
  }
}