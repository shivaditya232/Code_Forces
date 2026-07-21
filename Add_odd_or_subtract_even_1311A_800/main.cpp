#include<iostream>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int a,b;
        cin>>a>>b;
        int count=0;
        if(a<b){
            int remaining=b-a;
            if(remaining%2!=0){
                count=1;
            }
            else{
                count=2;
            }
        }
        if(a>b){
            int remaining=a-b;
            if(remaining%2!=0){
                count=2;
            }
            else{
                count=1;
            }
        }
        cout<<count<<endl;
    }
    return 0;
}