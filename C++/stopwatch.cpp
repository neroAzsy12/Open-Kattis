#include <iostream>
using namespace std;

int main() {
  int n;   // n = number of times the stopwatch is pressed
  cin >> n;

  if(n % 2 == 0) {    // start/stop takes two presses, so if n is divisible by 2, the stopwatch is currently stopped
    int sum = 0;    // the total number of secs displayed on the stopwatch
    while(n > 0) {
        int a, b;   // a = time when stopwatch started, b = time when stopwatch is stopped
        cin >> a >> b;
        sum += (b - a); // increment sum by the difference between b and a
        n -= 2;         // decrement n by 2, since it takes 2 pushes to start the watch again
    }
    cout << sum << endl;
  } else {
    cout << "still running" << endl;    // if n is odd, then the watch is still running
  }
}