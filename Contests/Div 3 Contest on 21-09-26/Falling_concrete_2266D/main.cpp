#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        vector<long long> b(n);
        for(int j=0;j<n;j++){
            long long x;
            cin>>x;
            b[j]=x-(j+1);
        }
        sort(b.begin(),b.end());
        int cur=1,best=1;
        for(int j=1;j<n;j++){
            if(b[j]==b[j-1]){
                continue;
            }
            if(b[j]==b[j-1]+1){
                cur++;
            }
            else{
                cur=1;
            }
            best=max(best,cur);
        }
        cout<<best<<endl;
    }
    return 0;
}