#include<iostream>
using namespace std;

vector<int> intersectTwoRanges(vector<int> pair1,vector<int> pair2){
    if(pair1[0]>pair2[0]){
        vector<int> temp=pair2;
        pair2=pair1;
        pair1=temp;
    }
    if(pair1[1]>=pair2[1]){
        return {pair2[0],pair2[1]};
    }
    if(pair1[1]>=pair2[0]){
        return {pair2[0],pair1[1]};
    }
    else{
        return {};
    }
}
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n,diff;
        cin>>n>>diff;
        vector<int> nums;
        for(int j=0;j<n;j++){
            int ele;
            cin>>ele;
            nums.push_back(ele);
        }
        int ans=0;
        int checkPointer=1;
        vector<int> range1(2);
        range1[0]=nums[0]-diff;
        range1[1]=nums[0]+diff;
        
        while(checkPointer<n){
            vector<int> range2={nums[checkPointer]-diff,nums[checkPointer]+diff};
            if(intersectTwoRanges(range1,range2).empty()){
                ans++;
                
                range1=range2;
            }
            else{
                range1=intersectTwoRanges(range1,range2);
            }
            checkPointer++;
        }
        cout<<ans;
    }
    return 0;
}