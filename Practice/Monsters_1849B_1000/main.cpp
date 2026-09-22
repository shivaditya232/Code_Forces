#include<iostream>
using namespace std;

    int findMax(vector<int> list){
    int max=INT_MIN;
    for(int k=0;k<list.size();k++){
        if(list[k]>max){
            max=list[k];
        }
    }
    return max;
}
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n,k;
        cin>>n>>k;
        vector<int> list;
        int max=INT_MIN;
        for(int j=0;j<n;j++){
            int ele;
            cin>>ele;
            if(ele>max){
                max=ele;
            }
            list.push_back(ele);
        }
        while(max!=0){
        for(int z=0;z<list.size();z++){
            if(list[z]==max){
                list[z]=list[z]-k;
                if(list[z]<=0){
                    cout<<z<<" ";
                }
                break;
            }
           
            
        }
        int max=findMax(list);
    }
    cout<<endl;
    }
    return 0;
}