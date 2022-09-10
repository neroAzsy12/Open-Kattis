#include <iostream>
using namespace std;

int main() {
  int a;  // num of articles you plan to publish
  int i;  // impact factor the owners require
  cin >> a >> i;

  int result = (a * i) - (a - 1); // min num of scientists need to be bribed
  cout << result << endl;
}