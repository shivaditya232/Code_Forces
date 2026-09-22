#include<iostream>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        int min=INT_MAX;
        for(int j=0;j<n;j++){
            int ele;
            cin>>ele;
            if(ele<min){
                min=ele;
            }
        }
        cout<<n-min<<endl;
    }
    return 0;

}