#include<iostream>
#include<cmath>
using namespace std;
int main(){
    char start;
    char end;
    int time;
    cin>>start>>end>>time;
    string combo="v<^>";
    int startIndex;
    int endIndex;
    string check="v<^>v";
    for(int i=0;i<4;i++){
        if(combo[i]==start){
            startIndex=i;
        }
        if(combo[i]==end){
            endIndex=i;
        }
    }
    if(abs(startIndex-endIndex)%2==0){
        cout<<"undefined";
    }
    else{
        if(time%4==1){
            if(check[startIndex+1]==end){
                cout<<"cw";
            }
            else{
                cout<<"ccw";
            }
        }
        else{
            if(check[startIndex+1]==end){
                cout<<"ccw";
            }
            else{
                cout<<"cw";
            }
        }
    }
    return 0;
}