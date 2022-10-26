#include <iostream>
using namespace std;

int main() {
  int x;  // x = megabytes per month
  int n;  // n = the first n months
  cin >> x >> n; 

  int total = 0;  // total = the amount of megabytes that will be available for the next n+1 month

  for (int i = 0; i < n; i++) {
    int p;      // p = the num of megabytes spent in each month
    cin >> p; 

    total += (x - p);   // add the difference between the x-megabytes allowed and the p-megabytes used for the month
  }
  total += x;     // add x-megabytes to the total to get the amount of megabytes available for the next month
  cout << total << endl;
}