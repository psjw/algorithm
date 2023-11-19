package com.algorithm.boj.boj_24479;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main_24479 {
    final static int MAX = 10000000 + 10;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int N, M, R;
    static int[] answer;
    static int order;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());

            graph = new ArrayList[MAX];
            IntStream.rangeClosed(0, N)
                    .forEach(x -> graph[x] = new ArrayList<>());
            visited = new boolean[N + 1];
            answer = new int[MAX];
            order = 1;

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph[u].add(v);
                graph[v].add(u);
            }

            for (int i = 1; i <= N; i++) {
                Collections.sort(graph[i]);
            }

            dfs(R);

            for (int i = 1; i <= N; i++) {
                bw.write(String.valueOf(answer[i]));
                bw.newLine();
            }
            bw.flush();
        }
    }

    private static void dfs(int index) {
        visited[index] = true;
        answer[index] = order;
        order++;

        for (int i = 0; i < graph[index].size(); i++) {
            Integer next = graph[index].get(i);
            if(!visited[next]){
                dfs(next);
            }
        }
    }
}
