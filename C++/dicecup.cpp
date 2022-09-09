#include <iostream>
#include <algorithm>
#include <cstdlib>
using namespace std;

int main() {
  int n, m;
  cin >> n >> m;

  if (n == m) {
    cout << n + 1 << endl;
  } else {
    int start = min(n, m) + 1;
    int end = abs(n - m) + 1;

    for (int i = start; i < start + end; i++) {
      cout << i << endl;
    }
  }
}