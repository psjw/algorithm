package com.algorithm.boj.boj_2606;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_2606 {

    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;

    public static void main(String[] args) throws IOException {
        //0. 입력 및 초기화
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            N = Integer.parseInt(br.readLine());
            M = Integer.parseInt(br.readLine());
            graph = new boolean[N + 1][N + 1];
            visited = new boolean[N + 1];

            //1. graph에 연결정보 채우기
            for (int i = 0; i < M; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = true;
                graph[y][x] = true;
            }

            //2. dfs(재귀함후 호출)
            dfs(1);

            //3. 출력
            bw.write(String.valueOf(answer - 1));
            bw.flush();
        }
    }

    private static void dfs(int index) {
        visited[index] = true;
        answer++;
        for (int i = 1; i <= N; i++) {
            if(!visited[i] && graph[index][i]){
                dfs(i);
            }
        }
    }
}
