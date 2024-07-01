package com.algorithm.boj.boj_11724;

import java.io.*;
import java.util.StringTokenizer;

public class Main_11724_3 {
    static int[][] graph;
    static int[] visit;
    static int N, M, answer;
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            graph = new int[N + 1][N + 1];
            visit = new int[N + 1];


            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = 1;
                graph[y][x] = 1;
            }

            for (int i = 1; i < N + 1; i++) {
                if(visit[i] == 0){
                    answer++;
                    dfs(i);
                }
            }

            bw.write(String.valueOf(answer));
            bw.flush();
        }
    }

    private static void dfs(int idx) {
        visit[idx] = 1;

        for (int i = 1; i < N + 1; i++) {
            if(visit[i] ==0 && graph[idx][i] ==1 ){
                dfs(i);
            }
        }
    }
}
