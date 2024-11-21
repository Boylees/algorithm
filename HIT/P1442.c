#include <stdio.h>
using namespace std;

#define cc 405

int n, m;
int a[cc][cc];

void init() {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            a[i][j] = -1;
            //printf("%-5d", a[i][j]);
        }
    }
    a[startx][starty] = 0;
}

void show() {
    for (int i = 1; i <= n)
}

struct node {
    int x;
    int y;
};

int fx[8][2] = {1,2, -1,2, 1,-2, -1,-2, 2,1, 2,-1, -2,1, -2,-1};
void bfs() {
    struct node t;
    t.x = startx;
    t.y = starty;

    queue<struct node> q;
    q.push(t);

    while(!q.empty()) {
        t = q.front();
        q.pop();
        for (int f = 0; f < 8; f++) {
            t2 = t;
            t2.x += fx[f][0];
            tx.y += fx[f][1];
            
            if(t2.x <= 0 || tx.y <= 0 || t2.x > n || tx.y > m)
                continue;
            if(a[t2.x][tx.y] == -1) {
                continue;
            }

            a[t2.x][t2.y] = a[t.x][t.y] + 1;

        }
    }
}
int main() {
    cin >> n >> m >> startx >> starty;
    init();
    bfs();
    show();
}