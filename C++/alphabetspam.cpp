#include <iostream>
#include <string>
using namespace std;

int main() {
    int white = 0;
    int lower = 0;
    int upper = 0;
    int symbol = 0;

    string text;
    cin >> text;

    double len = text.length();

    for (int i = 0; i < len; i++) {
        char c = text.at(i);
        if (c == '_') {
            white += 1;
        } else if ((int)c >= 97 && (int)c <= 122) {
            lower += 1;
        } else if ((int)c >= 65 && (int)c <= 90) {
            upper += 1;
        } else {
            symbol += 1;
        }
    }

    cout << white / len << endl;
    cout << lower / len << endl;
    cout << upper / len << endl;
    cout << symbol / len << endl;
}