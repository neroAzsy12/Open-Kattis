#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main() {
  vector<int> costs {0, 9, 6, 24,29,22, // SPACE, !, ", #, $, %
                     24,3, 12,12,17,13, // &, ', (, ), *, +
                     7, 7, 4, 10,22,19, // ,, -, ., /, 0, 1
                     22,23,21,27,26,16, // 2, 3, 4, 5, 6, 7
                     23,26,8, 11,10,14, // 8, 9, :, ;, <, =
                     10,15,32,24,29,20, // >, ?, @, A, B, C
                     26,26,20,25,25,18, // D, E, F, G, H, I
                     18,21,16,28,25,26, // J, K, L, M, N, O
                     23,31,28,25,16,23, // P, Q, R, S, T, U
                     19,26,18,14,22,18, // V, W, X, Y, Z, [ 
                     10,18,7, 8, 3, 23, // \, ], ^, _, `, a
                     25,17,25,23,18,30, // b, c, d, e, f, g
                     21,15,20,21,16,22, // h, i, j, k, l, m
                     18,20,25,25,13,21, // n, o, p, q, r, s
                     17,17,13,19,13,24, // t, u, v, w, x, y
                     19,18,12,18,9};    // z, {, |, }, ~
  
  string text;
  while (getline(cin, text)) {
    int total = 0;
    for (int i = 0; i < text.length(); i++) {
      total += costs[text[i] - 32];
    }

    cout << total << endl;
  }
}
