#include <iostream>
using namespace std;

int main() {
  int a, b;
  cin >> a >> b;

  (a > b ? printf("%d %d\n", b, a) : printf("%d %d\n", a, b));
}