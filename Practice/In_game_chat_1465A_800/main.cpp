#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        int length;
        string word;
        cin>>length>>word;
        int count=0;
        for(int i=length-1;i>=0;i--){
            if(word.at(i)==')'){
                count++;
            }
            if(word.at(i)!=')'){
                break;
            }
            
        }
        if(length-count>=count){
                cout<<"NO";
            }
            else{
                cout<<"YES";
            }
    }
    return 0;
}