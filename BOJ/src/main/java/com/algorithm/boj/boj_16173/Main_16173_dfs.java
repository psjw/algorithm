package com.algorithm.boj.boj_16173;

import java.io.*;
import java.util.StringTokenizer;

public class Main_16173_dfs {
    private static int N;
    private static int[][] graph;
    private static boolean[][] visited;
    private static int[] dx = {1, 0};
    private static int[] dy = {0, 1};
    private static boolean answer;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            N = Integer.parseInt(br.readLine());
            visited = new boolean[N + 1][N + 1];
            graph = new int[N + 1][N + 1];

            for (int i = 1; i <= N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= N; j++) {
                    int temp = Integer.parseInt(st.nextToken());
                    graph[i][j] = temp;
                }
            }

            dfs(1, 1);

           bw.write(answer ? "HaruHaru" : "Hing");
           bw.flush();
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        if (graph[x][y] == -1) {
            answer = true;
            return;
        }


        for (int i = 0; i < dx.length; i++) {
            int nextX = x + (dx[i] * graph[x][y]);
            int nextY = y + (dy[i] * graph[x][y]);
            if (validNext(nextX, nextY) && !visited[nextX][nextY]) {
                dfs(nextX, nextY);
            }

        }

    }

    private static boolean validNext(int nextRightX, int nextRightY) {
        return nextRightX > 0 && nextRightX <= N && nextRightY > 0 && nextRightY <= N;
    }
}
