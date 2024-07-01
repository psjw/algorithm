package com.algorithm.boj.boj_24479;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main_24479_3 {
    static List<Integer> graph[];
    static int visit[];
    static int answer[];
    static int N, M, R, INDEX;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());

            visit = new int[N + 1];
            answer = new int[N];
            graph = new ArrayList[N + 1];
            IntStream.rangeClosed(0, N).forEach(x -> graph[x] = new ArrayList<>());

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x].add(y);
                graph[y].add(x);
            }

            IntStream.rangeClosed(0, N).forEach(x -> Collections.sort(graph[x]));

            dfs(R);


            IntStream.rangeClosed(1, N).forEach(x ->{
                try {
                    bw.write(String.valueOf(visit[x])+"\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            bw.flush();
        }
    }

    private static void dfs(int idx) {
        INDEX++;
        visit[idx] = INDEX;

        for (int i = 0; i < graph[idx].size() ; i++) {
            Integer currentIdx = graph[idx].get(i);
            if (visit[currentIdx] == 0) {
                dfs(currentIdx);
            }
        }
    }
}
