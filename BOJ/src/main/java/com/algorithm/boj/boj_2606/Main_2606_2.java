package com.algorithm.boj.boj_2606;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main_2606_2 {
    private static int N, M;
    private static int graph[][];
    private static int visited[];
    private static int answer;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            N = Integer.parseInt(br.readLine());
            M = Integer.parseInt(br.readLine());
            graph = new int[N + 1][N + 1];
            visited = new int[N + 1];
            for (int i = 1; i <= M; i++) {
                String[] splitEdge = br.readLine().split(" ");
                int startNode = Integer.parseInt(splitEdge[0]);
                int endNode = Integer.parseInt(splitEdge[1]);
                graph[startNode][endNode] = 1;
                graph[endNode][startNode] = 1;
            }
            dfs(1);
            bw.write(String.valueOf(answer - 1));
            bw.flush();
        }


    }

    private static void dfs(int startNode) {
        visited[startNode] = 1;
        answer++;
        for (int i = 1; i <= N; i++) {
            if (graph[startNode][i] == 0) {
                continue;
            }
            if (visited[i] == 0) {
                dfs(i);
            }
        }
    }
}
