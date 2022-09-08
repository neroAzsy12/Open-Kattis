#include <iostream>
using namespace std;

int main() {
  // N: num of eye designs 
  // T: num of nose designs
  // M: num of mouth designs
  int n, t, m;
  cin >> n >> t >> m;

  // Output: num of different possible designs
  cout << n * t * m << endl;
}