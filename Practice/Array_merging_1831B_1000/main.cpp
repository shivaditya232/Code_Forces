#include<iostream>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int length;
        cin>>length;
        int count=1;
        vector<int> list1(2*length+1);
        int ele;
        cin>>ele;
        list1[ele-1]=1;
        int prev=ele;
        for(int j=1;j<length;j++){
            int ele;
            cin>>ele;
            if(ele==prev){
                count+=1;
            }
            else{
                count=1;
                prev=ele;
            }
            list1[ele-1]=max(list1[ele-1],count);
        }
        vector<int> list2(2*length+1);
        int ele;
        cin>>ele;
        list2[ele-1]=1;
        int prev=ele;
        for(int z=1;z<length;z++){
            int ele;
            cin>>ele;
            if(prev==ele){
                count+=1;
            }
            else{
                count=1;
                prev=ele;
            }
            list2[ele-1]=max(list2[ele-1],count);
        }
        int maxFreq=1;
        int maxIndex;
        for(int a=0;a<2*length+1;a++){
            int temp=list1[a]+list2[a];
            if(temp>maxFreq){
                maxFreq=temp;
                maxIndex=a;
            }
        }
        cout<<maxFreq;
    }
    return 0;
}