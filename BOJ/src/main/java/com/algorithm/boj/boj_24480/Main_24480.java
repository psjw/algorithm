package com.algorithm.boj.boj_24480;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main_24480 {
    final static int MAX = 1000000 + 10;
    static List<Integer>[] graph;
    static boolean[] visited;
    static int[] answer;
    static int N, M, R;
    static int order;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            graph = new ArrayList[MAX];
            visited = new boolean[MAX];
            answer = new int[MAX];
            order = 1;
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());

            IntStream.rangeClosed(0, N)
                    .forEach(i -> graph[i] = new ArrayList<>());

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph[u].add(v);
                graph[v].add(u);
            }

            for(int i = 0; i<=N ;i++){
                Collections.sort(graph[i], Collections.reverseOrder());
            }

            dfs(R);

            IntStream.rangeClosed(1, N).forEach(i -> {
                try {
                    bw.write(String.valueOf(answer[i]));
                    bw.newLine();
                    bw.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

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
