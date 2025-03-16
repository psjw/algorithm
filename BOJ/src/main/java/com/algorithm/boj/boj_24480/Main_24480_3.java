package com.algorithm.boj.boj_24480;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main_24480_3 {
    private static int N, M, R;
    private static ArrayList<Integer> graph[];
    private static int visited[];
    private static int RESULT;

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());

            graph = new ArrayList[N+1];
            visited = new int[N+1];

            IntStream.rangeClosed(0, N).forEach(i -> {
                graph[i] = new ArrayList<>();
            });

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                graph[x].add(y);
                graph[y].add(x);
            }

            Arrays.stream(graph).forEach(x -> Collections.sort(x,Collections.reverseOrder()));

            dfs(R);

            IntStream.rangeClosed(1, N).forEach(i -> {
                try {
                    bw.write(String.valueOf(visited[i]));
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            bw.flush();
        }
    }

    private static void dfs(int idx) {
        RESULT++;
        visited[idx] = RESULT;

        for(int i =0 ; i < graph[idx].size(); i++) {
            Integer nextIdx = graph[idx].get(i);
            if(visited[nextIdx]==0) {
                dfs(nextIdx);
            }
        }
    }
}
