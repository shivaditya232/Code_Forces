#include<iostream>
using namespace std;
int main(){
    int stop=1;
    string word;
    cin>>word;
    int count=1;
    bool flag;
    for(int i=0;i<word.size()-1;i++){
        char ch=word[i];
        if(ch!=word[i+1]){
            count=1;
        }
        else{
            count+=1;
        }
        if(count==7){
            cout<<"YES";
            flag=false;
            break;
        }
    }
    if(flag){
        cout<<"NO";
    }

    return 0;
}