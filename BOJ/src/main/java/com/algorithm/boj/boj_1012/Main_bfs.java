package com.algorithm.boj.boj_1012;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.StringTokenizer;

public class Main_bfs {
    private static int T, N, M, K;
    private static int[][] map;
    private static int[][] visited;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            T = Integer.parseInt(br.readLine());

            for (int t = 0; t < T; t++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                N = Integer.parseInt(st.nextToken());
                M = Integer.parseInt(st.nextToken());
                K = Integer.parseInt(st.nextToken());
                map = new int[N + 1][M + 1];
                visited = new int[N + 1][M + 1];

                for (int i = 0; i < K; i++) {
                    st = new StringTokenizer( br.readLine());
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());
                    map[x][y] = 1;
                }


            }
        }

    }

}
