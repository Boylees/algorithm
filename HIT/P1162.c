#include <stdio.h>
int s[][];
void dfs(int x, int y) {
    if (x < 1 || y < 1 || x > n || y > n || s[x][y] != 0) {
        return;
    }
    s[x][y] = 2;
    dfs(n - 1, m);
    dfs(n + 1, m);
    dfs(n, m - 1);
    dfs(n, m + 1);
}