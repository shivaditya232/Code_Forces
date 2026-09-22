#include <bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    for(int i = 0; i < n; i++){
        int x;
        cin >> x;
        if(x % 2 != 0) cout << x;
        else cout << x-1;
        if(i < n-1) cout << " ";
    }
    cout << endl;
    return 0;
}