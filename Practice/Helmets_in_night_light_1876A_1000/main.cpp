#include <bits/stdc++.h>
using namespace std;

int main()
{
    long long t;
    cin >> t;
    while (t--)
    {
        long long n, p;
        cin >> n >> p;
        vector<pair<long long, long long>> v(n);
        for (int i = 0; i < n; i++) cin >> v[i].second;
        for (int i = 0; i < n; i++) cin >> v[i].first;

        sort(v.begin(), v.end());

        long long minimum_cost = p;
        long long already_shared = 1;

        for (auto it : v)
        {
            if (it.first >= p) break;
            if (already_shared + it.second > n)
            {
                minimum_cost += (n - already_shared) * it.first;
                already_shared = n;
                break;
            }
            else
            {
                minimum_cost += it.second * it.first;
                already_shared += it.second;
            }
        }

        minimum_cost += (n - already_shared) * p;
        cout << minimum_cost << "\n";
    }
    return 0;
}