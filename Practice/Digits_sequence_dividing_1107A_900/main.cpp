#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        int length;
        string word;
        cin>>length>>word;
        if(length==2){
            if(word[0]<word[1]){
                cout<<"YES"<<endl;
                cout<<2;
                cout<<word[0]+""+word[1];
            }
            else{
                cout<<"NO";
            }
        }
        else{
            char prev=word[0];
            bool flag=false;;
            for(int i=1;i<length;i++){
                if(prev!=word[i]){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                cout<<"NO";
            }
            else{
                cout<<2;
                cout<<word[0]+""+word.substr(1,length);
            }
        }
    }
    return 0;
}