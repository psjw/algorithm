package com.algorithm.boj.boj_24479;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main_24479_2 {
    private static int V, E, R; //V : 정점 집합, E : 간선 집합, R : 시작 정점
    private static ArrayList<Integer> graph[];
    private static int visited[];
    private static int maxIdx;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            graph = new ArrayList[V + 1];
            IntStream.rangeClosed(0, V)
                    .forEach(x -> graph[x] = new ArrayList<>());
            visited = new int[V + 1];
            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph[u].add(v);
                graph[v].add(u);
            }

            IntStream.rangeClosed(0, V)
                    .forEach(x -> Collections.sort(graph[x]));

            dfs(R);
            IntStream.rangeClosed(1, V).forEach(x -> {
                try {
                    bw.write(String.valueOf(visited[x]));
                    bw.write("\n");
                    bw.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }

    private static void dfs(int idx) {
        maxIdx++;
        visited[idx] = maxIdx;
        for (int i = 0; i < graph[idx].size(); i++) {
            if (visited[graph[idx].get(i)] > 0) {
                continue;
            }
            dfs(graph[idx].get(i));
        }
    }
}
