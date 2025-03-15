package com.algorithm.boj.boj_2606;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2606_4 {
    private static int QUANTITY;
    private static int PAIR;
    private static int[] visited;
    private static int[][] graph;
    public static void main(String[] args) throws IOException {
        //0. 입력 및 초기화
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            //1. graph에 연결정보 채우기
            QUANTITY = Integer.parseInt(br.readLine());
            PAIR = Integer.parseInt(br.readLine());
            visited = new int[QUANTITY + 1];
            graph = new int[QUANTITY + 1][QUANTITY + 1];
            for (int i = 0; i < PAIR; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = 1;
                graph[y][x] = 1;
            }

            //2. dfs(재귀함수) 호출
            dfs(1);

            //3. 출력
            bw.write(String.valueOf(Arrays.stream(visited).sum() - 1));
            bw.flush();
        }
    }

    private static void dfs(int i) {
        visited[i] = 1;
        for(int j = 1; j <= QUANTITY; j++) {
            if(graph[i][j] == 1 && visited[j] == 0) {
                dfs(j);
            }
        }
    }

}
