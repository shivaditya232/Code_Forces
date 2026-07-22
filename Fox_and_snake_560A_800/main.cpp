#include<iostream>
using namespace std;
int main(){
    int n,m;
    cin>>n>>m;
    for(int i=1;i<n+1;i++){
        for(int j=1;j<m+1;j++){
            if(i%2!=0){
                cout<<"#";
            }
            else{
                if(i%4==2){
                    if(j==m) cout<<"#";
                    else cout<<".";
                } 
                else {
                    if(j==1) cout<<"#";
                    else cout<<".";
                }
            }
        }
        cout<<endl;
    }
    return 0;
}