#include<iostream>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int length;
        int minDays;
        int maxTemp;
        cin>>length>>minDays>>maxTemp;
        int start=0;
        int end=0;
        for(int j=0;j<length;j++){
            int ele;
            cin>>ele;
            if(ele<=maxTemp){
                start++;
            }
            else{
                if(start>=minDays){
                    long long m=start-minDays+1;
                    end+=m*(m+1)/2;
                }
                start=0;
            }
        }
        if (start >= minDays) {
        long long m = start - minDays + 1;
        end += m * (m + 1) / 2;
    }
    cout << end << "\n";
        cout<<end;
        
    }
    return 0;
}