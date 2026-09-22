#include<iostream>
using namespace std;
int main(){
    int n,m;
    cin>>n>>m;
    vector<int> list(m);
    for(int i=0;i<n;i++){
        int controlBulbs;
        cin>>controlBulbs;
        for(int j=0;j<controlBulbs;j++){
            int bulb;
            cin>>bulb;
            list[bulb-1]=1;
        }
    }
    bool flag=true;
    for(int z=0;z<m;z++){
        if(list[z]==0){
            cout<<"NO";
            flag=false;
            break;
        }
    }
    if(flag){
        cout<<"YES";
    }
    return 0;
}