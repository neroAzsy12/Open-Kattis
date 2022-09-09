#include <iostream>
#include <set>
#include <string>
using namespace std;

int main() {
  int p;  // num of parts the boat has
  int n;  // num of days in the boating season
  cin >> p >> n;

  set<string> parts;      // set that contains p-parts
  bool allParts = false;  // flag check

  for (int i = 1; i <= n; i++) {
    string w;           // boat part that was bought on day i
    cin >> w;
    parts.insert(w);    // insert the part into the parts set

    if (parts.size() == p) {
      cout << i << endl;  // if all p-parts were bought, print i
      allParts = true;    // make the flag = true
      break;
    }
  }

  if (!allParts) {
    cout << "paradox avoided" << endl;  // all p-parts were not bought in n-days
  }
}