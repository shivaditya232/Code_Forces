#include<iostream>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int length;
        cin>>length;
        vector<int> list;
        for(int j=0;j<length;j++){
            int ele;
            cin>>ele;
            list.push_back(ele);
        }
        sort(begin(list),end(list),greater<int>());
        for(int z=0;z<length;z++){
            cout<<list[z];
        }
        cout<<'\n';
    }
    return 0;
}