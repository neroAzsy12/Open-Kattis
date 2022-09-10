#include <iostream>
using namespace std;

int main() {
  int cases;
  cin >> cases;

  while (cases--) {
    double beats, seconds;
    cin >> beats >> seconds;

    double bpm = 60 * beats / seconds;   // calculated bpm
    double abpm = bpm - (60 / seconds);  // min ABPM
    double mbpm = bpm + (60 / seconds);  // max ABPM

    cout << fixed;
    cout.precision(4);

    cout << abpm << " " << bpm << " " << mbpm << endl;
  }
}