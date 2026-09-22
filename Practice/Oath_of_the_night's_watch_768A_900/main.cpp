#include<iostream>
using namespace std;
int main(){
    vector<int> list;
    int n;
    cin>>n;
    int x;
    
    cin>>x;
    int min=x;
    int max=x;
    list.push_back(x);
    for(int i=1;i<n;i++){
        cin>>x;
        if(x<min){
            min=x;
        }
        if(x>max){
            max=x;
        }
        list.push_back(x);
    }
    int count=0;
    for(int i=0;i<n;i++){
        if(list[i]>min && list[i]<max){
            count+=1;
        }
    }
    cout<<count;
    
    return 0;
}