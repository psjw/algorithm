package com.algorithm.boj.boj_11724;

import java.io.*;
import java.util.StringTokenizer;

public class Main_11724_5 {
    private static int N, M, RESULT;
    private static int graph[][];
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            graph = new int[N + 1][N + 1];
            visited = new boolean[N + 1];
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = 1;
                graph[y][x] = 1;
            }

            for (int i = 1; i <= N; i++) {
                if(visited[i]) continue;
                dfs(i);
                RESULT++;
            }

            bw.write(String.valueOf(RESULT));
            bw.flush();
        }
    }

    private static void dfs(int i) {
        visited[i] = true;

        for(int j = 1 ; j <= N; j++) {
            if(graph[i][j]==1 && !visited[j]) {
                dfs(j);
            }
        }
    }
}
