package com.algorithm.boj.boj_16173;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main_16173_bfs {
    private static int N;
    private static boolean[][] visited;
    private static int[][] graph;
    private static int[] dx = {1, 0};
    private static int[] dy = {0, 1};
    private static Queue<Coordinate> queue;
    private static boolean ansnwer;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            N = Integer.parseInt(br.readLine());
            visited = new boolean[N + 1][N + 1];
            graph = new int[N + 1][N + 1];
            queue = new LinkedList<>();

            for (int i = 1; i <= N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= N; j++) {
                    int temp = Integer.parseInt(st.nextToken());
                    graph[i][j] = temp;
                }
            }

            queue.add(new Coordinate(1, 1));
            visited[1][1] = true;
            bfs();

            bw.write(ansnwer ? "HaruHaru" : "Hing");
            bw.flush();

        }
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            int currentX = current.getX();
            int currentY = current.getY();
            if (graph[currentX][currentY] == -1) {
                ansnwer = true;
                break;
            }


            for(int i =0; i< dx.length; i++) {
                int nextX = currentX + (dx[i] * graph[currentX][currentY]);
                int nextY = currentY + (dy[i] * graph[currentX][currentY]);

                if (validNext(nextX, nextY) && !visited[nextX][nextY]) {
                    visited[nextX][nextY] = true;
                    queue.add(new Coordinate(nextX, nextY));
                }
            }

        }
    }


    static class Coordinate {
        private int x, y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Coordinate{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

    }

    public static boolean validNext(int x, int y) {
        if (x < 1 || x > N || y < 1 || y > N) {
            return false;
        }
        return true;
    }

}
