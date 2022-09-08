#include <iostream>
#include <set>
using namespace std;

int main() {
  set<int> distinctModValues;

  for (int i = 0; i < 10; i++) {
    int num;
    cin >> num;

    distinctModValues.insert(num % 42);
  }

  cout << distinctModValues.size() << endl;
}