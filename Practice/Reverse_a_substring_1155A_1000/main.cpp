#include <iostream>
using namespace std;
int main(){
    int length;
    string word;
    cin >> length >> word;

    string sorted = word;
    sort(sorted.begin(), sorted.end());

    int i = 0;
    while (i < length && word[i] == sorted[i]) i++;

    if (i == length) { cout << "NO\n"; return 0; }

    int j = i + 1;
    while (word[j] != sorted[i]) j++;

    cout << "YES\n" << i + 1 << " " << j + 1 << "\n";
    return 0;
}