#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        string s;
        cin>>s;
        if(s[0]=='1'){
            int zeros=0;
            for(int j=0;j<n;j++){
                if(s[j]=='0'){
                    zeros++;
                }
            }
            cout<<zeros<<endl;
        }
        else{
            int ones=0,ans=0;
            for(int j=0;j<n;j++){
                if(s[j]=='1'){
                    ones++;
                }
                else{
                    ans=min(ans+1,ones);
                }
            }
            cout<<ans<<endl;
        }
    }
    return 0;
}