package com.algorithm.boj.boj_13565;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_13565_bfs_1 {
    private static int M, N;
    private static int[][] graph;
    private static boolean[][] visited;
    private static Queue<Dot> queue;
    private static String answer;
    private static int[] x = {0, 0, 1, -1};
    private static int[] y = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            graph = new int[M + 1][N + 1];
            visited = new boolean[M + 1][N + 1];
            queue = new LinkedList<Dot>();
            answer = "NO";

            for (int i = 1; i <= M; i++) {
                st = new StringTokenizer(br.readLine());
                String tempStr = st.nextToken();
                for (int j = 1; j <= N; j++) {
                    int temp = Integer.parseInt(Character.toString(tempStr.charAt(j - 1)));
                    graph[i][j] = temp;
                }
            }

            for (int i = 1; i <= N; i++) {
                if (graph[1][i] == 0 && !visited[1][i]) {
                    visited[1][i] = true;
                    queue.add(new Dot(1, i));
                    bfs();
                }
            }


            for (boolean visit : visited[M]) {
                if(visit){
                    answer = "YES";
                    break;
                }
            }

            bw.write(answer);
            bw.flush();

        }
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Dot current = queue.poll();
            int currentX = current.getX();
            int currentY = current.getY();
            for (int i = 0; i < x.length; i++) {
                int nextX = currentX + x[i];
                int nextY = currentY + y[i];
                if (nextX < 1 || nextX > M || nextY < 1 || nextY > N) {
                    continue;
                }

                if(visited[nextX][nextY] || graph[nextX][nextY] == 1){
                    continue;
                }
                visited[nextX][nextY] = true;
                queue.add(new Dot(nextX, nextY));
            }
        }
    }


    private static class Dot {
        private int x, y;

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
}
