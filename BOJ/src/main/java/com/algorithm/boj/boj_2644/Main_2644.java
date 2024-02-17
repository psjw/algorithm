package com.algorithm.boj.boj_2644;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_2644 {
    private static int N, X, Y, M;
    private static int[][] graph;
    private static int[] visited;
    private static int answer;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(br.readLine());
            graph = new int[N + 1][N + 1];
            visited = new int[N + 1];
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = 1;
                graph[y][x] = 1;
            }
            answer = -1;
            dfs(X, 0);
            bw.write(String.valueOf(answer));
            bw.flush();
        }
    }

    private static void dfs(int startIdx, int depth) {
        visited[startIdx] = 1;
        if (startIdx == Y) {
            answer = depth;
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (graph[startIdx][i] == 0) {
                continue;
            }
            if (visited[i] > 0) {
                continue;
            }
            dfs(i, depth + 1);
        }
    }
}
