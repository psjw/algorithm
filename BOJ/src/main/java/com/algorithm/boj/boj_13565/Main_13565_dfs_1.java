package com.algorithm.boj.boj_13565;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_13565_dfs_1 {
    private static int M, N;
    private static int[][] graph;
    private static boolean[][] visited;
    private static String answer;
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            graph = new int[M + 1][N + 1];
            visited = new boolean[M + 1][N + 1];
            answer = "NO";

            for (int i = 1; i <= M; i++) {
                String tempStr = br.readLine();
                for (int j = 1; j <= N; j++) {
                    int value = Integer.parseInt(Character.toString(tempStr.charAt(j - 1)));
                    graph[i][j] = value;
                }
            }
            for (int i = 1; i <= N; i++) {
                if (graph[1][i] == 0 && !visited[1][i]) {
                    dfs(1, i);
                }
            }

            for (boolean visit : visited[M]) {
                if (visit) {
                    answer = "YES";
                }
            }

            bw.write(answer);
            bw.flush();

        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < dx.length; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX < 1 || nextX > M || nextY < 1 || nextY > N) {
                continue;
            }
            if (graph[nextX][nextY] == 1) {
                continue;
            }
            if (visited[nextX][nextY]) {
                continue;
            }
            dfs(nextX, nextY);
        }
    }
}
