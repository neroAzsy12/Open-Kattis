#include <iostream>
using namespace std;

// if the suit is dominant, get the dominate value else, get the non-dominate value
int getVal(char num, bool isDominate) {
  switch (num) {
    case 'A':
      return 11;
    case 'K':
      return 4;
    case 'Q':
      return 3;
    case 'J':
      return (isDominate ? 20 : 2);
    case 'T':
      return 10;
    case '9':
      return (isDominate ? 14 : 0);
    default:
      return 0;
  }
}

int main() {
    int hands;      // num of hands
    char trump_suit;// value of suit that is dominant (S, H, D or C)
        
    cin >> hands >> trump_suit;

    char num;       // num card of the suit
    char suit;      // the suit (S, H, D, or C)
    int sum = 0;    // num of points from the hands

    for (int i = 0; i < 4 * hands; i++) {
        cin >> num >> suit;
        bool isTrump = false;

        if (suit == trump_suit) {   // if suit is dominant, get the value from dominant
            isTrump = true;
        } 

        sum += getVal(num, isTrump);
    } 

    cout << sum << endl;
}