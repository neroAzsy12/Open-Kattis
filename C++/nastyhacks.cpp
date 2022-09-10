#include <iostream>
using namespace std;

int main() {
  int cases;
  cin >> cases;

  for (int i = 0; i < cases; i++) {
    // r = the expected revenue if you do not advertise
    // e = the expected revenue if you not advertise
    // c = the cost of advertising
    int r, e, c;
    cin >> r >> e >> c;

    if (e - c > r) {
      cout << "advertise" << endl;
    } else if (e - c == r) {
      cout << "does not matter" << endl;
    } else if (e - c < r) {
      cout << "do not advertise" << endl;
    }
  }
}