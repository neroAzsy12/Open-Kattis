// g++ -o filename filename.cpp -std=c++14
#include <iostream>
using namespace std;

int main() {
    int tests;
    cin >> tests;

    for(int t = 0; t < tests; t++) {
        int n;
        cin >> n;

        int max = 0;
        for(int i = 1; i < n; i++) {
            int tmp;
            cin >> tmp;
            max += tmp - 1;
        }

        cin >> n;
        max += n; 

        printf("%d\n", max);
    }
}