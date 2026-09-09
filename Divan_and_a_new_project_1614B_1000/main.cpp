#include <iostream>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;

        long long a[200005];
        for(int i=1;i<=n;i++){
            cin >> a[i];
        }

        
        pair<long long,int> p[200005];
        for(int i=1;i<=n;i++){
            p[i-1] = make_pair(a[i], i);
        }

        
        sort(p, p+n);
        reverse(p, p+n);

        long long x[200005];
        x[0] = 0;
        long long ans = 0;

        for(int i=0;i<n;i++){
            long long d = i/2 + 1;
            long long sign = 1;
            if(i % 2 == 1) sign = -1;

            int idx = p[i].second;
            x[idx] = sign * d;
            ans = ans + 2 * p[i].first * d;
        }

        cout << ans << "\n";
        for(int i=0;i<=n;i++){
            cout << x[i];
            if(i != n) cout << " ";
        }
        cout << "\n";
    }
    return 0;
}