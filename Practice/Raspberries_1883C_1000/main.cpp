#include<iostream>
#include<climits>
#include<cmath>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n,k;
        cin>>n>>k;
        int min=INT_MAX;
        int count_even=2;
        for(int j=0;j<n;j++){
            int num;
            cin>>num;
            if(num%k==0){
                min=0;
            }
            else if(num-num%k<min){
                min=num-num%k;
            }
            
            if(k==4){
                if(num%2==0){
                    count_even--;
                }
            }
        }
        if(k==4){
            cout<<mini(min,count_even);
        }
        cout<<min<<endl;
    }
    return 0;
}
int mini(int a,int b){
    if(a<b){
        return a;
    }
    else{
        return b;
    }
}