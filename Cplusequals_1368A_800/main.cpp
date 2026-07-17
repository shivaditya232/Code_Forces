#include<cmath>
#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        int a;
        int b;
        int maxi;
        int count=0;
        cin>>a>>b>>maxi;
        while(max(a,b)<=maxi){
            if(a <= b) a += b;
            else b += a;
            count++;
        }
        cout<<count<<endl;
    }
    return 0;
}