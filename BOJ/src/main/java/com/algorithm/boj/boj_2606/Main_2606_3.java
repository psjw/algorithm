package com.algorithm.boj.boj_2606;

import java.io.*;
import java.util.StringTokenizer;

public class Main_2606_3 {
    static int answer = 0;
    static boolean[][] graph;
    static boolean[] visited;
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            N = Integer.parseInt(br.readLine());
            M = Integer.parseInt(br.readLine());
            graph = new boolean[N+1][N+1];
            visited = new boolean[N+1];
            for(int i = 0; i < M; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = true;
                graph[y][x] = true;
            }

            dfs(1);

            bw.write(String.valueOf(answer - 1));
            
        }
    }

    private static void dfs(int idx) {
        visited[idx] = true;
        answer++;
        for (int i = 0; i <= N; i++) {
            if(!visited[i] && graph[idx][i]) {
                dfs(i);
            }
        }

    }
}
