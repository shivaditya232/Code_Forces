#include<iostream>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int a,b;
        cin>>a>>b;
        if(a==b){
            cout<<0<<endl;
        }
        else if(a<b){
            int total=0;
            while(b%8==0){
                b=b/8;
                total+=1;
            }
            if(a==b){
                cout<<total<<endl;
                continue;
            }
            while(b%4==0){
                b=b/4;
                total+=1;
            }
            if(a==b){
                cout<<total<<endl;
                continue;
            }
            while(b%2==0){
                b=b/2;
                total+=1;
            }
            if(a==b){
                cout<<total<<endl;
                continue;
            }
            else{
                cout<<-1<<endl;
            }
        }
        else{
            int total=0;
            while(a%8==0){
                a=a/8;
                total+=1;
            }
            if(a==b){
                cout<<total<<endl;
                continue;
            }
            while(a%4==0){
                a=a/4;
                total+=1;
            }
            if(a==b){
                cout<<total<<endl;
                continue;
            }
            while(a%2==0){
                a=a/2;
                total+=1;
            }
            if(a==b){
                cout<<total<<endl;
                continue;
            }
            else{
                cout<<-1<<endl;
            }
        }
    }
    return 0;
}