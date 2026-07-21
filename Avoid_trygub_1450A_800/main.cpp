#include<iostream>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        string s;
        cin>>n>>s;
        string result="";
        string rest="";
        for(char c : s){
            if(c=='b') result+=c;
            else rest+=c;
        }
        cout<<result+rest<<"\n";
    }
    return 0;
}