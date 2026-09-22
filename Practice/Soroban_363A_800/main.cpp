#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    if(n%10==0){
        cout<<"O-|-OOOO";
    }
    while(n>0){
        string format="O-|-OOOO";
        if(n%10>=5){
            swap(format[1],format[0]);
            int barLeft=n%10-5;
            for(int i=3;i<format.size()-1;i++){
                if(barLeft==0){
                    break;
                }
                else{
                    swap(format[i+1],format[i]);
                    barLeft--;
                }
            }
            cout<<format<<endl;
        }
        else{
            int barLeft=n%10;
            for(int i=3;i<format.size()-1;i++){
                if(barLeft==0){
                    break;
                }
                else{
                    swap(format[i+1],format[i]);
                    barLeft--;
                }
            }
            cout<<format<<endl;
        }
        n=n/10;
    }
    return 0;
}