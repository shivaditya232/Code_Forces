#include <bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        long long sumT = 0, minT = LLONG_MAX, minS = LLONG_MAX;
        for (int i = 0; i < n; i++) {
            int m;
            cin >> m;
            long long s = LLONG_MAX, second = LLONG_MAX;
            for (int j = 0; j < m; j++) {
                long long x;
                cin >> x;
                if (x < s) { second = s; s = x; }
                else if (x < second) { second = x; }
            }
            sumT += second;
            minT = min(minT, second);
            minS = min(minS, s);
        }
        cout << minS + sumT - minT << "\n";
    }
    return 0;
}