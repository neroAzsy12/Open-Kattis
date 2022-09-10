#include <iostream>
#include <unordered_set>
#include <string>
using namespace std;

int main() {
  int teams; 
  cin >> teams;

  unordered_set<string> schools;
  string school, team;
  int count = 0;

  while (count < teams && schools.size() < 12) {
    cin >> school >> team;
    if(schools.find(school) == schools.end()) {
      schools.insert(school);
      cout << school + " " + team << endl;
    }

    count++;
  }
}