#include <iostream>
using namespace std;

int main() {
    string s;

    cin>>s;

    int countA=0;
    int countB=0;
    int countC=0;

        for (int i = 0; i < s.length(); i++) {
            if (s.at(i) == 'a') {
                countA++;
            }
            else if (s.at(i) == 'b') {
                countB++;
            }
            else if (s.at(i) == 'c') {


                countC++;
            }
        }
    if (countC==countA||countC==countB) {
        if (string(countA, 'a') + string(countB, 'b') + string(countC, 'c') == s) {
            cout<<"YES"<<endl;
        }
        else {
            cout<<"NO"<<endl;
        }
    }
    else {
        cout<<"NO"<<endl;
    }

    return 0;
}