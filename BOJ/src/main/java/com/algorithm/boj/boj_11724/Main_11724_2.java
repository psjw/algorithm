package com.algorithm.boj.boj_11724;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_11724_2 {
    private static int N, M;
    private static int[][] graph;
    private static int[] visited;
    private static int answer;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            graph = new int[N + 1][N + 1];
            visited = new int[N + 1];
            for (int i = 1; i <= M; i++) {
                st = new StringTokenizer(br.readLine());
                int startNode = Integer.parseInt(st.nextToken());
                int endNode = Integer.parseInt(st.nextToken());
                graph[startNode][endNode] = 1;
                graph[endNode][startNode] = 1;
            }
            for (int i = 1; i <= N; i++) {
                if(visited[i] == 1){
                    continue;
                }
                dfs1(i);
                answer++;
            }

            bw.write(String.valueOf(answer));
            bw.flush();
        }
    }

    private static void dfs1(int idx) {
        visited[idx] = 1;
        for (int i = 1; i <= N; i++) {
            if (graph[idx][i] == 0) {
                continue;
            }
            if (visited[i] == 1) {
                continue;
            }
            dfs1(i);
        }
    }
}
