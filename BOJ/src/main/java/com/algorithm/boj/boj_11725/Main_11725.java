package com.algorithm.boj.boj_11725;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main_11725 {
    private static int N;
    private static List<Integer> graph[];
    private static int[] visited;
    private static int[] answer;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            N = Integer.parseInt(br.readLine());
            graph = new ArrayList[N + 1];
            visited = new int[N + 1];
            answer = new int[N + 1];
            IntStream.rangeClosed(0, N).forEach(x -> graph[x] = new ArrayList<>());
            for (int i = 0; i < N-1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x].add(y);
                graph[y].add(x);
            }
            dfs(1);

            IntStream.range(2, answer.length).forEach(x -> {
                try {
                    bw.write(String.valueOf(answer[x]));
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            bw.flush();
        }
    }

    private static void dfs(int startIdx) {
        visited[startIdx] = 1;

        for (int i = 0; i < graph[startIdx].size(); i++) {
            int next = graph[startIdx].get(i);
            if (visited[next] > 0) {
                continue;
            }
            answer[next] = startIdx;
            dfs(next);
        }
    }
}
