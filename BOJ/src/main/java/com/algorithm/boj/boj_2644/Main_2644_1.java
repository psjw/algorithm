package com.algorithm.boj.boj_2644;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main_2644_1 {
    private static int N, M, RESULT;
    private static int S1, S2;
    private static ArrayList<Integer> graph[];
    private static int[] visited;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            S1 = Integer.parseInt(st.nextToken());
            S2 = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(br.readLine());
            visited = new int[N + 1];
            graph = new ArrayList[N + 1];
            IntStream.rangeClosed(0, N).forEach(i -> graph[i] = new ArrayList<>());

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                graph[x].add(y);
                graph[y].add(x);
            }
            RESULT = -1;
            dfs(S1, 0);

            bw.write(String.valueOf(RESULT));
            bw.flush();
        }
    }

    private static void dfs(int index, int depth) {

        visited[index] = 1;
        if(index == S2){
            RESULT = depth;
            return;
        }

        for (int i = 0; i < graph[index].size(); i++) {
            int next = graph[index].get(i);
            if(visited[next]==0){
                dfs(next, depth + 1);
            }
        }
    }
}
