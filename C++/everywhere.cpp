#include <iostream>
#include <set>
#include <string>
using namespace std;

int main() {
  int cases;
  cin >> cases;

  while (cases--) {
    int cities;
    cin >> cities;
    set<string> uniqueCities;

    for (int i = 0; i < cities; i++) {
      string city;
      cin >> city;

      uniqueCities.insert(city);
    }

    cout << uniqueCities.size() << endl;
  }
}