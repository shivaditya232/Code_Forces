#include <iostream>
using namespace std;

int main() {
#ifndef ONLINE_JUDGE
	freopen("Error.txt", "w", stderr);
#endif

	int t = 1;
	cin >> t;

	while (t--) {
		long long n;
		cin >> n;
		vector<long long> v(n);

		for (int i = 0; i < n; i++) {
			cin >> v[i];
		}

		long long ans = v[0];
		long long sum = v[0];

		for (int i = 1; i < n; i++) {
			if ((v[i] ^ v[i - 1]) & 1) {
				sum = max(v[i], sum + v[i]);
			} else {
				sum = v[i];
			}
			ans = max(ans, sum);
		}

		cout << ans << endl;
	}
}