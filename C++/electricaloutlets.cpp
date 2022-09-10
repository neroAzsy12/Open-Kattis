#include <iostream>
using namespace std;

int main() {
  int cases;
  cin >> cases;

  for (int i = 0; i < cases; i++) {
    int strips;
    cin >> strips;

    int sum = 0;
    for (int i = 0; i < strips; i++) {
      int outlets;
      cin >> outlets;

      sum += outlets;
    }

    cout << (sum - (strips - 1)) << endl;
  }
}