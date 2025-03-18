package com.algorithm.boj.boj_1012;

import java.io.*;
import java.util.StringTokenizer;



public class Main_1012_dfs_1 {
    private static int T, M, N, K;
    private static int[][] graph;
    private static boolean[][] visited;
    private static int answer;
    private static int x[] = {0, 0, 1, -1};
    private static int y[] = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            T = Integer.parseInt(br.readLine());


            for (int t = 0; t < T; t++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                M = Integer.parseInt(st.nextToken());
                N = Integer.parseInt(st.nextToken());
                K = Integer.parseInt(st.nextToken());

                graph = new int[M + 1][N + 1];
                visited = new boolean[M + 1][N + 1];
                answer = 0;

                for (int i = 0; i < K; i++) {
                    st = new StringTokenizer(br.readLine());
                    int x = Integer.parseInt(st.nextToken()) + 1;
                    int y = Integer.parseInt(st.nextToken()) + 1;
                    graph[x][y] = 1;
                }

                for (int i = 1; i <= M; i++) {
                    for (int j = 1; j <= N; j++) {
                        if(!visited[i][j] && graph[i][j] == 1) {
                            answer++;
                            dfs(i, j);
                        }
                    }
                }

                bw.write(String.valueOf(answer));
                bw.newLine();
            }

            bw.flush();

        }
    }

    private static void dfs(int s, int e) {
        visited[s][e] = true;

        for (int i = 0; i < x.length; i++) {
            int nextX = s + x[i];
            int nextY = e + y[i];
            if (nextX < 0 || nextX > M || nextY < 0 || nextY > N) {
                continue;
            }
            if(graph[nextX][nextY] == 0 || visited[nextX][nextY]) {
                continue;
            }
            dfs(nextX, nextY);
        }
    }
}
