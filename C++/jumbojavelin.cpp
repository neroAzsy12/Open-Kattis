#include <iostream>
using namespace std;

int main() {
  int n; // number of rods
  cin >> n;

  int total = 0;
  for (int i = 0; i < n; i++) {
    int len;
    cin >> len;

    total += len;
  }

  cout << total - (n - 1) << endl;
}