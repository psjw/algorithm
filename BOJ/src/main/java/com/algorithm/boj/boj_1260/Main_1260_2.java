package com.algorithm.boj.boj_1260;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1260_2 {
    private static int N, M, V;
    private static int graph[][];
    private static int visited[];
    private static int maxIdx;
    private static Queue<Integer> result;
    private static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());
            graph = new int[N + 1][N + 1];
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph[u][v] = 1;
                graph[v][u] = 1;
            }
            visited = new int[N + 1];
            result = new LinkedList<>();
            dfs(V);
            result.stream().forEach(x ->{
                try {
                    bw.write(String.valueOf(x));
                    bw.write(' ');
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            bw.newLine();
            result.clear();
            bfs();
            result.stream().forEach(x ->{
                try {
                    bw.write(String.valueOf(x));
                    bw.write(' ');
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            bw.flush();
        }
    }

    private static void bfs() {
        queue = new LinkedList<>();
        visited = new int[N + 1];

        queue.add(V);
        visited[V] = 1;
        while (!queue.isEmpty()){
            int curIdx = queue.poll();
            result.add(curIdx);
            for (int i = 1; i <= N; i++) {
                if(graph[curIdx][i] == 0 ){
                    continue;
                }
                if(visited[i] > 0){
                    continue;
                }
                queue.add(i);
                visited[i] = 1;
            }
        }


    }

    private static void dfs(int idx) {
        maxIdx++;
        visited[idx] = maxIdx;
        result.add(idx);
        for (int i = 1; i <= N; i++) {
            if (graph[idx][i] == 0) {
                continue;
            }
            if (visited[i] > 0) {
                continue;
            }
            dfs(i);
        }
    }
}
