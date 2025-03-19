package com.algorithm.boj.boj_4963;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_4963_bfs_1 {
    private static int w, h;
    private static int[][] graph;
    private static boolean[][] visited;
    private static int answer;
    private static Queue<Coordinate> queue = new LinkedList<>();
    private static int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
    private static int[] dy = {1, -1, 0, 0, -1, 1, 1, -1};

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            while (true) {
                queue.clear();
                answer = 0;
                StringTokenizer st = new StringTokenizer(br.readLine());
                w = Integer.parseInt(st.nextToken());
                h = Integer.parseInt(st.nextToken());

                if(w == 0 || h == 0) break;


                graph = new int[h + 1][w + 1];
                visited = new boolean[h + 1][w + 1];

                for (int i = 1; i <= h; i++) {
                    st = new StringTokenizer(br.readLine());
                    for (int j = 1; j <= w; j++) {
                        int temp = Integer.parseInt(st.nextToken());
                        graph[i][j] = temp;
                    }
                }

                for (int i = 1; i <= h; i++) {
                    for (int j = 1; j <= w; j++) {
                        if (graph[i][j] == 1 && visited[i][j] == false) {
                            queue.add(new Coordinate(i, j));
                            answer++;
                            bfs();
                        }
                    }
                }
                bw.write(String.valueOf(answer));
                bw.newLine();
                bw.flush();
            }
        }

    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            for (int i = 0; i < dx.length; i++) {
                int nextX = current.getX() + dx[i];
                int nextY = current.getY() + dy[i];
                if (nextX < 1 || nextX > h || nextY < 1 || nextY > w) {
                    continue;
                }
                if (visited[nextX][nextY]) {
                    continue;
                }
                if (graph[nextX][nextY] == 0) {
                    continue;
                }
                visited[nextX][nextY] = true;
                queue.add(new Coordinate(nextX, nextY));
            }
        }
    }

    private static class Coordinate {
        private int x;
        private int y;

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
