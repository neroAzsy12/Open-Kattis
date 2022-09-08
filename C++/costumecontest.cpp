#include <iostream>
#include <unordered_map>
#include <string>
#include <vector>
#include <utility>
#include <algorithm>
using namespace std;

int main() {
  int n;
  string costume;

  cin >> n;
  unordered_map<string, int> costumes;

  for (int i = 0; i < n; i++) {
    cin >> costume;

    if (costumes.find(costume) != costumes.end()) {
      costumes[costume]++;
    } else {
      costumes[costume] = 1;
    }
  }

  int minVal = n;
  for (auto it = costumes.begin(); it != costumes.end(); ++it) {
        minVal = min(minVal, it->second);
  }
  
  vector<string> results;
  for (auto it = costumes.begin(); it != costumes.end(); ++it) {
        if (it->second == minVal) {
            results.push_back(it->first);
        }
  }

  sort(results.begin(), results.end());
  for (int i = 0; i < results.size(); i++) {
    cout << results[i] << endl;
  }
}