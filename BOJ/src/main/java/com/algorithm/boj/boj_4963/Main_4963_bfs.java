package com.algorithm.boj.boj_4963;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_4963_bfs {
    private static int W, H;
    private static int[][] map;
    private static int[][] visited;
    private static int answer;

    private static int dx[] = {0, 0, -1, 1, -1, 1, -1, 1};
    private static int dy[] = {1, -1, 0, 0, 1, 1, -1, -1};
    private static Queue<Coordinate> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            while (true) {
                queue.clear();
                answer = 0;
                StringTokenizer st = new StringTokenizer(br.readLine());
                W = Integer.parseInt(st.nextToken());
                H = Integer.parseInt(st.nextToken());
                if (W == 0 && H == 0) {
                    break;
                }
                map = new int[W + 1][H + 1];
                visited = new int[W + 1][H + 1];
                for (int i = 1; i <= H; i++) {
                    st = new StringTokenizer(br.readLine());
                    for (int j = 1; j <= W; j++) {
                        map[j][i] = Integer.parseInt(st.nextToken());
                    }
                }

                for (int i = 1; i <= W; i++) {
                    for (int j = 1; j <= H; j++) {
                        if (visited[i][j] > 0) {
                            continue;
                        }
                        if (map[i][j] == 0) {
                            continue;
                        }
                        queue.add(new Coordinate(i, j));
                        visited[i][j] = 1;
                        bfs();
                        answer++;
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
            Coordinate curCoordinate = queue.poll();
            for (int i = 0; i < dx.length; i++) {
                int nextX = curCoordinate.getX() + dx[i];
                int nextY = curCoordinate.getY() + dy[i];

                if (nextX < 1 || nextY < 1 || nextX > W || nextY > H) {
                    continue;
                }
                if (visited[nextX][nextY] > 0) {
                    continue;
                }
                if(map[nextX][nextY] == 0){
                    continue;
                }
                queue.add(new Coordinate(nextX, nextY));
                visited[nextX][nextY] = 1;
            }
        }
    }

    private static class Coordinate {
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
    }
}
