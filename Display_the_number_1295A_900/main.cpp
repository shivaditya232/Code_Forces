#include<iostream>
using namespace std;
int main(){
    int t;
    cout<<"Enter the number of inputs";
    cin>>t;
    int output;
    for(int i=0;i<t;i++){
        int num;
        cin>>num;
        int one;
        int output=0;
        if(num%2==0){
            one=num/2;
        }
        else{
            one=(num/2)-1;
        }
        while(one>0){
            output=1+output*10;
            one--;
        }
        if(num%2!=0){
            output+=7*pow(10,num/2-1);
        }
        

        
    }
    cout<<output;
    return 0;
}