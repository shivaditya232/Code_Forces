#include<iostream>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int a,b,c,x,y;
        cin>>a>>b>>c>>x>>y;
        if(a>=x){
            if(b+c>=y){
                cout<<"YES";
            }
            else{
                cout<<"NO";
            }
        }
        else{
            if(a+c>=x){
                c-=x-a;
                if(b+c>=y){
                    cout<<"YES";
                }
            }
            else{
                cout<<"NO";
            }
        }
    }
    return 0;
}