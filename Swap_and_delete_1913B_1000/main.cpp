#include<iostream>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        string s;
        cin >> s;
        int n = s.size();
        int zeros = 0, ones = 0;
        for (int i = 0; i < n; i++)
        {
            if (s[i] == '0') zeros++;
            else ones++;
        }
        int len = 0;
        for (int i = 0; i < n; i++)
        {
            if (s[i] == '0' && ones > 0) { ones--; len++; }
            else if (s[i] == '1' && zeros > 0) { zeros--; len++; }
            else break;
        }
        cout << n - len << "\n";
    }
    return 0;
}