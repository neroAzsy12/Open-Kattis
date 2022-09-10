#include <iostream>
#include <cmath>
using namespace std;

int main() {
  int n;
  cin >> n;

  int total = 0;
  for (int i = 0; i < n; i++) {
    int num;
    cin >> num;

    int power = num % 10;
    num /= 10;
    total += pow(num, power);
  }

  cout << total << endl;
}