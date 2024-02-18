
package com.algorithm.boj.boj_1012;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1012_dfs {
    private static int T, N, M, K;
    private static int[][] map;
    private static int[][] visited;
    private static int dx[] = {0, 0, -1, 1}; //상하 좌우
    private static int dy[] = {1, -1, 0, 0};
    private static int depth;


    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            T = Integer.parseInt(br.readLine());

            for (int t = 0; t < T; t++) {
                depth = 0;
                StringTokenizer st = new StringTokenizer(br.readLine());
                N = Integer.parseInt(st.nextToken());
                M = Integer.parseInt(st.nextToken());
                K = Integer.parseInt(st.nextToken());
                map = new int[N + 1][M + 1];
                visited = new int[N + 1][M + 1];
                for (int i = 0; i < K; i++) {
                    st = new StringTokenizer(br.readLine());
                    int x = Integer.parseInt(st.nextToken()) + 1;
                    int y = Integer.parseInt(st.nextToken()) + 1;
                    map[x][y] = 1;
                }

                for (int i = 1; i <= N; i++) {
                    for (int j = 1; j <= M; j++) {
                        if (visited[i][j] > 0) {
                            continue;
                        }
                        if (map[i][j] == 0) {
                            continue;
                        }
                        dfs(i, j);
                        depth++;
                    }
                }

                bw.write(String.valueOf(depth));
                bw.newLine();
                bw.flush();

            }
        }

    }

    private static void dfs(int x, int y) {
        visited[x][y] = 1;
        for (int i = 0; i < dx.length; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX < 1 || nextY < 1 || nextX > N || nextY > M) {
                continue;
            }
            if (visited[nextX][nextY] > 0) {
                continue;
            }
            if (map[nextX][nextY] == 0) {
                continue;
            }
            dfs(nextX, nextY);
        }
    }
}