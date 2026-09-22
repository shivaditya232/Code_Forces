#include <iostream>
using namespace std;
int main(){
    int t;
    cin >> t;
    while (t--) {
        int n; char c;
        cin >> n >> c;
        string s;
        cin >> s;

        vector<int> g;                 
        for (int i = 0; i < n; i++)
            if (s[i] == 'g') g.push_back(i);

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] == c) {
                int pos = lower_bound(g.begin(), g.end(), i) - g.begin();  
                int wait;
                if (pos < (int)g.size()) wait = g[pos] - i;   
                else wait = g[0] + n - i;                     
                ans = max(ans, wait);
            }
        }
        cout << ans << "\n";
    }
    return 0;
}