#include <iostream>
using namespace std;

int main() {
    int x;
    int n;
    cin >> x >> n; 

    int total = 0;

    for(int i = 0; i < n; i++) {
        int p;
        cin >> p; 

        total += (x - p);
    }
    total += x;
    printf("%d\n", total);
}