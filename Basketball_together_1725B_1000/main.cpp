#include<iostream>
using namespace std;
int main(){
    int N,D;
    cin>>N>>D;
    vector<int> list;
    for(int i=0;i<N;i++){
        int num;
        cin>>num;
        list.push_back(num);
    }
    sort(list.begin(),list.end(),greater<int>());
    /*100,90,80,70,60,50*/
    int ans=0;
    int size=list.size();
    for(int i=0;i<list.size();i++){
        int k=D/list[i]+1;
        if(size-k>=0){
            size=size-k;
            ans+=1;
        }
        else{
            break;
        }
    }
    cout<<ans;
    return 0;
}

