#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    int count=0;
    int prev=0;
    int result=0;
    for(int i=0;i<n;i++){
        int ele;
        cin>>ele;
        if(ele>prev){
            prev=ele;
            count+=1;
        }
        else{
            if(count>=result){
                result=count;
                
            }
            count=1;
            prev=ele;
        }
    }
    result=max(count,result);
    cout<<result;
    return 0;
}