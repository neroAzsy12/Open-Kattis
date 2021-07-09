#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    double sum = 0;
    for(int i = 0; i < n; i++) {
        double q, y;
        cin >> q >> y;

        sum += (q * y);
    }
    printf("%f\n", sum);
}