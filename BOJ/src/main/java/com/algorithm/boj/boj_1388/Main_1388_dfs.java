package com.algorithm.boj.boj_1388;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1388_dfs {
    private static int N, M;
    private static boolean[][] visited;
    private static char[][] graph;
    private static int answer;
    private static int[] increase = {0, 1};

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            visited = new boolean[N + 1][M + 1];
            graph = new char[N + 1][M + 1];
            for (int i = 1; i <= N; i++) {
                String temp = br.readLine();
                for (int j = 1; j <= M; j++) {
                    char tempChar = temp.charAt(j - 1);
                    graph[i][j] = tempChar;
                }
            }

            for(int i = 1; i <= N; i++) {
                for(int j = 1; j <= M; j++) {
                    if(!visited[i][j]) {
                        answer++;
                        dfs(i, j);
                    }
                }
            }

            bw.write(String.valueOf(answer));
            bw.flush();

        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        int nextX = x + (graph[x][y] == '|' ? increase[1] : increase[0]);
        int nextY = y + (graph[x][y] == '-' ? increase[1] : increase[0]);
        if( nextX <1 || nextY <1 || nextX > N || nextY > M) {
            return;
        }
        if(!visited[nextX][nextY] && graph[nextX][nextY] == graph[x][y]) {
            dfs(nextX, nextY);
        }
    }
}
