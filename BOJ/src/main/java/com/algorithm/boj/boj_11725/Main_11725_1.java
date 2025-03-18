package com.algorithm.boj.boj_11725;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main_11725_1 {
    private static int N;
    private static int[] visited;
    private static ArrayList<Integer>[] graph;
    private static int[] result;

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            N = Integer.parseInt(br.readLine());
            graph = new ArrayList[N + 1];
            visited = new int[N + 1];
            result = new int[N + 1];

            IntStream.rangeClosed(0, N).forEach(i -> graph[i] = new ArrayList<>());


            for (int i = 0; i < N - 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x].add(y);
                graph[y].add(x);
            }

            dfs(1);

            IntStream.rangeClosed(2, N).forEach(i -> {
                try {
                    bw.write(String.valueOf(result[i]));
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });


            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void dfs(int index) {
        visited[index] = 1;

        for (int i = 0; i < graph[index].size(); i++) {
            Integer next = graph[index].get(i);
            if(visited[next] == 0){
                result[next] = index;
                dfs(next);
            }
        }
    }
}
