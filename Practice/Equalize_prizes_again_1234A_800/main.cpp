#include<iostream>
using namespace std;
int main(){
    int q;
    cin>>q;
    for(int i=0;i<q;i++){
        int n;
        cin>>n;
        int sum=0;
        for(int j=0;j<n;j++){
            int a;
            cin>>a;
            sum+=a;
        }
        if(sum%2!=0){
            cout<<sum/2+1<<endl;
        }
        else{
            cout<<sum/2<<endl;
        }
    }
    return 0;
}