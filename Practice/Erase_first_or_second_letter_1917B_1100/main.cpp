#include <bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while (t--) {
        int n;
        string s;
        cin >> n >> s;
        bool seen[26] = {false};
        long long distinct = 0, ans = 0;
        for (char c : s) {
            if (!seen[c - 'a']) { seen[c - 'a'] = true; distinct++; }
            ans += distinct;
        }
        cout << ans << "\n";
    }
    return 0;
}