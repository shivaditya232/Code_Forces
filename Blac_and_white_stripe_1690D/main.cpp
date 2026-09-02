#include<iostream>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n,k;
        cin>>n>>k;
        string word;
        cin>>word;
        
        int cost1=0;
        int conse=0;
        int cost2=1;
        vector<int> shift={'W','B'};
        for(int j=0;j<2;j++){
            int pointer1=0;
            bool flag=true;
            if(i%2!=0){
                if(word[pointer1]=='B'){
                    conse+=1;
                }
                if(conse==k){
                    cout<<0<<'\n';
                    flag=false;
                    continue;
                }
                if(word[pointer1]!='B'){
                    cost1+=1;

                }
                pointer1++;
            
                while(pointer1<n){
                    if(word[pointer1]=='B'){
                    conse+=1;
                }
                if(conse==k){
                    cout<<0<<'\n';
                    flag=false;
                    break;
                }
                    if(pointer1%2==1){
                        if(word[pointer1]=='B'){
                            cost1++;
                        }
                        pointer1++;
                    }
                    else{
                        if(word[pointer1]=='W'){
                            cost1++;
                        }
                        pointer1++;
                    }
                }
                if(!flag){
                    cout<<0<<'\n';
                    continue;
                }
            }
            else{
                if(word[pointer1]!='W'){
                    cost2+=1;
                }
                pointer1++;
            
                while(pointer1<n){
                    if(pointer1%2==1){
                        if(word[pointer1]=='W'){
                            cost2++;
                        }
                        pointer1++;
                    }
                    else{
                        if(word[pointer1]=='B'){
                            cost2++;
                        }
                        pointer1++;
                    }
                }
            }
        }
        
        if(cost1<cost2){
            cout<<cost1<<'\n';
        }
        else{
            cout<<cost2<<'\n';
        }
        
    }
    return 0;
}