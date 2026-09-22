#include<iostream>
#include<vector>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        vector<int> list1;
        for(int j=0;j<n;j++){
            int ele;
            cin>>ele;
            list1.push_back(ele);
        }
        vector<int> list2(n);
        bool flag = true;

        int pointer1=0;
        int pointer2=1;
        int count=1;
        while(pointer2<n){
            if(list1[pointer1]==list1[pointer2]){
                count++;
                pointer2++;
            }
            else{
                if(count==1){
                    flag = false;
                    pointer1=pointer2;
                }
                else{
                    int groupStart = pointer1;
                    for(int k=groupStart; k<pointer2-1; k++){
                        list2[k] = k+2;
                    }
                    list2[pointer2-1] = groupStart+1;
                    pointer1=pointer2;
                }
                count=1;
                pointer2++;
            }
        }
        if(count==1){
            flag = false;
        } else {
            int groupStart = pointer1;
            for(int k=groupStart; k<pointer2-1; k++){
                list2[k] = k+2;
            }
            list2[pointer2-1] = groupStart+1;
        }

        if(!flag){
            cout<<-1<<"\n";
        } else {
            for(int z=0;z<n;z++){
                cout<<list2[z]<<' ';
            }
            cout<<"\n";
        }
    }
    return 0;
}