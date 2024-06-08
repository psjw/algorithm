package com.algorithm.boj.boj_1260;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main_1260 {
    final static int MAX = 1000 + 10;
    static boolean graph[][];
    static boolean visited[];
    static Queue<Integer> queue;
    static List<Integer> answer = new ArrayList<>();
    static int N, M, V;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            graph = new boolean[MAX][MAX];
            visited = new boolean[MAX];

            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());

            for (int i = 1; i <= M; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph[u][v] = true;
                graph[v][u] = true;
            }

            //1.dfs
            dfs(V);
            answer.stream().forEach(x -> {
                try {
                    bw.write(String.valueOf(x));
                    bw.append(' ');
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            //2.bfs
            bw.newLine();
            answer.clear();
            visited = new boolean[MAX];
            queue = new LinkedList<>();
            bfs(V);
            answer.stream().forEach(x -> {
                try {
                    bw.write(String.valueOf(x));
                    bw.append(' ');
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            bw.flush();
        }
    }

    private static void bfs(int index) {
        queue.add(index);
        visited[index] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            answer.add(now);


            for (int i = 1; i <= N; i++) {
                if (!visited[i] && graph[now][i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

    }

    private static void dfs(int index) {
        visited[index] = true;
        answer.add(index);

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && graph[index][i]) {
                dfs(i);
            }
        }
    }
}
