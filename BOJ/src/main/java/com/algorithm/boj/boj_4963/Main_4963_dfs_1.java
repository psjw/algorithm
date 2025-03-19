package com.algorithm.boj.boj_4963;

import java.io.*;
import java.util.StringTokenizer;

public class Main_4963_dfs_1 {
    private static int w, h;
    private static int[][] graph;
    private static boolean[][] visited;
    private static int answer;
    private static int dx[] = {0, 0, -1, 1, -1, 1, -1, 1};
    private static int dy[] = {1, -1, 0, 0, 1, 1, -1, -1};


    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                w = Integer.parseInt(st.nextToken());
                h = Integer.parseInt(st.nextToken());

                if(w == 0 && h == 0) break;

                graph = new int[h + 1][w + 1];
                visited = new boolean[h + 1][w + 1];
                answer = 0;

                for (int i = 1; i <= h; i++) {
                    st = new StringTokenizer(br.readLine());
                    for (int j = 1; j <= w; j++) {
                        graph[i][j] = Integer.parseInt(st.nextToken());
                    }
                }

                for (int i = 1; i <= h; i++) {
                    for (int j = 1; j <= w; j++) {
                        if (graph[i][j] == 1 && !visited[i][j]) {
                            answer++;
                            dfs(i, j);
                        }
                    }
                }

                bw.write(answer + "\n");
                bw.flush();

            }
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < dx.length; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if(nextX < 1 || nextX > h || nextY < 1 || nextY > w) {
                continue;
            }
            if( graph[nextX][nextY] == 0 || visited[nextX][nextY] ) {
                continue;
            }
            dfs(nextX, nextY);
        }
    }
}
