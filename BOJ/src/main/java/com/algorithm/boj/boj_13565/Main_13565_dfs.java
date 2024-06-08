package com.algorithm.boj.boj_13565;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.StringTokenizer;

public class Main_13565_dfs {
    private static int N, M;
    private static int[][] map;
    private static int[][] visited;

    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            map = new int[N + 1][M + 1];
            visited = new int[N + 1][M + 1];
            for (int i = 1; i <= N; i++) {
                String temp = br.readLine();
                for (int j = 1; j <= M; j++) {
                    map[i][j] = Character.getNumericValue(temp.charAt(j - 1));
                }
            }

            for (int i = 1; i <= M; i++) {
                if (map[1][i] > 0) {
                    continue;
                }
                if (visited[1][i] > 0) {
                    continue;
                }
                dfs(1, i);
            }

            OptionalInt first = Arrays.stream(visited[N]).filter(x -> x > 0).findFirst();
            if(first.isPresent()){
                bw.write('YES');
            }else{
                bw.write('NO');
            }
            bw.flush();
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = 1;
        for (int i = 0; i < dx.length; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX < 1 || nextY < 1 || nextX > N || nextY > M) {
                continue;
            }
            if(visited[nextX][nextY] > 0){
                continue;
            }
            if (map[nextX][nextY] > 0) {
                continue;
            }
            dfs(nextX, nextY);
        }
    }
}
