package com.algorithm.boj.boj_1012;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1012_bfs_1 {
    private static int T, M, N, K;
    private static int[][] graph;
    private static boolean[][] visited;
    private static int answer;
    private static Queue<Dot> queue = new LinkedList<>();
    private static int x[] = {0, 0, 1, -1};
    private static int y[] = {1, -1, 0, 0};


    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

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
                        if (graph[i][j] == 1 && !visited[i][j]) {
                            answer++;
                            visited[i][j] = true;
                            queue.add(new Dot(i, j));
                            bfs();
                        }
                    }
                }

                bw.write(String.valueOf(answer));
                bw.newLine();

            }
            bw.flush();
        }

    }

    private static class Dot {
        int x, y;

        public Dot(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    private static void bfs() {

        while (!queue.isEmpty()) {
            Dot current = queue.poll();
            for (int i = 0; i < x.length; i++) {
                int nextX = current.getX() + x[i];
                int nextY = current.getY() + y[i];
                if (nextX < 0 || nextX > M || nextY < 0 || nextY > N) {
                    continue;
                }
                if (visited[nextX][nextY] || graph[nextX][nextY] == 0) {
                    continue;
                }
                visited[nextX][nextY] = true;
                queue.add(new Dot(nextX, nextY));
            }
        }
    }
}
