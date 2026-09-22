#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    int count1=0;
    int count2=0;
    for(int i=0;i<n;i++){
        int pile1;
        cin>>pile1;
        count1+=pile1;
    }
    for(int i=0;i<n;i++){
        int pile2;
        cin>>pile2;
        count2+=pile2;
    }
    if(count2>count1){
        cout<<"No";
    }
    else{
        cout<<"Yes";
    }
    return 0;
}