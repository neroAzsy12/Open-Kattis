#include <iostream>
using namespace std;

int main() {
  int g, t, n;
  cin >> g >> t >> n;

  int total_weight_items = 0;   // total weight of items we are bringing
  for (int i = 0; i < n; i++) {
    int item_weight;
    cin >> item_weight;
    
    total_weight_items += item_weight;
  }

  int trailer_weight = g - t;
  trailer_weight = (trailer_weight * 0.9) - total_weight_items;

  cout << trailer_weight << endl;
}