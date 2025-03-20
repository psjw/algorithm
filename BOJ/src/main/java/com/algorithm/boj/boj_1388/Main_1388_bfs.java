package com.algorithm.boj.boj_1388;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1388_bfs {
    private static int N, M;
    private static boolean[][] visited;
    private static char[][] graph;
    private static Queue<Coordinate> queue;
    private static int answer;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            visited = new boolean[N + 1][M + 1];
            graph = new char[N + 1][M + 1];
            queue = new LinkedList<>();
            for (int i = 1; i <= N; i++) {
                String temp = br.readLine();
                for (int j = 1; j <= M; j++) {
                    char tempChar = temp.charAt(j - 1);
                    graph[i][j] = tempChar;
                }
            }

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    if (!visited[i][j]) {
                        answer++;
                        queue.add(new Coordinate(i, j));
                        bfs();
                    }
                }
            }


            bw.write(String.valueOf(answer));
            bw.flush();


        }
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            visited[current.getX()][current.getY()] = true;

            if (graph[current.getX()][current.getY()] == '-') {
                int nextY = current.getY() + 1;
                if (nextY > M || nextY < 1) continue;
                if (graph[current.getX()][nextY] != graph[current.getX()][current.getY()]) {
                    continue;
                }
                queue.add(new Coordinate(current.getX(), nextY));
            }


            if (graph[current.getX()][current.getY()] == '|') {
                int nextX = current.getX() + 1;
                if (nextX > N|| nextX < 1) continue;
                if (graph[nextX][current.getY()] != graph[current.getX()][current.getY()]) {
                    continue;
                }
                queue.add(new Coordinate(nextX, current.getY()));
            }
        }
    }


    static class Coordinate {
        int x, y;

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
    }
}
