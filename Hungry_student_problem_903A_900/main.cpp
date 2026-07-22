#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        int chunk;
        cin>>chunk;
        if(chunk==1||chunk==2||chunk==4||chunk==5||chunk==8||chunk==11){
            cout<<"NO"<<endl;
        }
        else{
            cout<<"YES"<<endl;
        }
    }
    return 0;
}