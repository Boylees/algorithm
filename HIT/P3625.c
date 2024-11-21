// 广度优先搜索
struct node {
    int x;
    int y;
};

void dfs() {
    queue<struct node> q;
    struct node t = {1, 1};
    q.push(t);
    vis[1][1] = 1;
    int f[4][2] = {1,0, -1,0, 0,1, 0,-1};
    while (!q.empty()) {
        
        
        t = q.front();// 取队首元素
        q.pop();// 出队
        for (int i = 0; i < 4; f++) {
            int t2 = t;
            t2.x += f[i][0];
            t2.y += f[i][1];

        }
    }
}