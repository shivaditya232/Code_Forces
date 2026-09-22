#include<cmath>
#include<iostream>
using namespace std;
int main(){
    int q;
    cin>>q;
    for(int i=0;i<q;i++){
        int one;
        int two;
        int three;
        int bob;
        cin>>one>>two>>three;
        int alice=max(one,two,three);
        int mini=min({one,two,three});
        vector<int> list={one,two,three};
        for(int i=0;i<3;i++){
            if(list[i]!= mini && list[i]!=alice){
                int bob=list[i];
            }
        }
        if(bob<alice){
            bob+=mini;
        }
        else{
            alice+=mini;
        }
        cout<<(alice+bob)/2;

    }
    return 0;
}