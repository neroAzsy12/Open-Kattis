#include <iostream>
using namespace std;

int main() {
    int tests;
    cin >> tests; 

    for(int i = 0; i < tests; i++) {
        int k, n;
        cin >> k >> n;

        int sum = (n * (n + 1) / 2);    // forumla for finding sum of first n numbers
        int odd = n * n;                // formula for finding sum of first n odd numbers
        int even = n * (n + 1);         // formula for finding sum of first n even numbers

        printf("%d %d %d %d\n", k, sum, odd, even);
    }
}