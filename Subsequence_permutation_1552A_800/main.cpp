#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        int length;
        string word;
        cin>>length>>word;
        int result=length;
        string copy=word;
        sort(word.begin(),word.end());
        for(int i=0;i<length;i++){
            if(copy[i]==word[i]){
                result--;
            }
        }
        cout<<result;
    }
    return 0;
}