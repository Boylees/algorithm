#include <stdio.h>
#include <deque>
using namespace std;
#define MAX 200000;

int n[200000];
int f[2] = {-1, 1};
int x, y;

void init () {
    for (int i = 0; i < 200000; i++) {
        n[i] = 0;
    }
}
void bfs() {
    deque<int> q;
    q.push_back(x);
    while(!q.empty()) {
        int t = q.front();
        q.pop_front();
        if (t == y) {
            break;
        }
        for (int i = 0; i < 2; i++) {
            int next = t + f[i];
            if (next >= 0 && next <= 200000 && n[next] == 0) {
                n[next] = n[t] + 1;
                q.push_back(next);
            }
        }
        int next = t * 2;
        if (next >= 0 && next <= 200000 && n[next] == 0) {
            n[next] = n[t] + 1;
            q.push_back(next);
        }
    }
}

int main() {
    init();
    int m;
    scanf("%d", &m);
    for (int i = 0; i < m; i++) {
        scanf("%d %d", &x, &y);
        bfs();
        printf("%d\n", n[y]);
        init();
    }
}