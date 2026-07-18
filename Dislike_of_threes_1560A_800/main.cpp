#include<iostream>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int k;
        cin>>k;
        int j=1;
        vector<int> list;
        while(k>0){
            if(j%3!=0 && j%10!=3){
                list.push_back(j);
                k--;
            }
            j++;
        }
        cout<<list[list.size()-1];
    }

    return 0;
}