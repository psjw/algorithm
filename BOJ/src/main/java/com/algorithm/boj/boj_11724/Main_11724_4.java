package com.algorithm.boj.boj_11724;

import java.io.*;
import java.util.StringTokenizer;

public class Main_11724_4 {
    static boolean[] visited;
    static boolean[][] graph;
    static int N;
    static int M;
    static int answer;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            graph = new boolean[N + 1][N + 1];
            visited = new boolean[N + 1];
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = true;
                graph[y][x] = true;
            }
            for(int i = 1; i <= N; i++) {
                if(!visited[i]){
                    dfs(i);
                    answer++;
                }
            }

            bw.write(String.valueOf(answer));
            bw.flush();
        }
    }

    private static void dfs(int idx) {
        visited[idx] = true;
        for (int i = 1; i <= N; i++) {
            if(!visited[i] && graph[idx][i]) {
                dfs(i);
            }
        }
    }
}
