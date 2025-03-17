package com.algorithm.boj.boj_1260;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main_1260_3 {
    private static ArrayList<Integer> graph[];
    private static int N, M, V;
    private static int[] visited;
    private static Queue<Integer> queue;
    private static LinkedList<Integer> result;


    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());
            result = new LinkedList<>();
            graph = new ArrayList[N + 1];
            IntStream.rangeClosed(0, N).forEach(i -> graph[i] = new ArrayList<>());

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                graph[x].add(y);
                graph[y].add(x);
            }

            IntStream.rangeClosed(0, N).forEach(i -> Collections.sort(graph[i]));

            //dfs
            visited = new int[N+1];
            dfs(V);
            resultPrint(bw);

            bw.newLine();

            //bfs
            visited = new int[N+1];
            queue = new LinkedList<>();
            result.clear();
            bfs(V);
            resultPrint(bw);

            bw.flush();
        }

    }

    private static void resultPrint(BufferedWriter bw) {
        result.stream().forEach(res -> {
            try {
                bw.write(String.valueOf(res));
                bw.append(' ');
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static void bfs(int start) {
        result.add(start);
        visited[start] = 1;
        queue.add(start);

        while(!queue.isEmpty()) {
            Integer current = queue.poll();
            for(int i = 0; i < graph[current].size(); i++) {
                Integer next = graph[current].get(i);
                if (visited[next] == 0) {
                    queue.add(next);
                    visited[next] = 1;
                    result.add(next);
                }
            }
        }
    }

    private static void dfs(int index) {
        visited[index] = 1;
        result.add(index);

        for(int i = 0; i < graph[index].size(); i++) {
            int next = graph[index].get(i);
            if(visited[next]==0) dfs(next);
        }
    }
}
