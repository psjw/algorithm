package com.algorithm.boj.boj_11724;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_11724 {
    final static int MAX = 1000 + 10;
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;

    public static void main(String[] args) throws IOException {
        //0. 입력 및 초기화
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            //1. graph에 연결 정보 채우기
            graph = new boolean[MAX][MAX];
            visited = new boolean[MAX];
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = true;
                graph[y][x] = true;
            }

            //2. dfs(재귀함수 호출)
            for (int i = 1; i <= N; i++) {
                if (!visited[i]) {
                    dfs(i);
                    answer++;
                }
            }

            //3. 출력
            bw.write(String.valueOf(answer));
            bw.flush();
        }
    }

    private static void dfs(int index) {
        visited[index] = true;

        for (int i = 1; i <= N; i++) {
            if(!visited[i]&& graph[index][i]){
                dfs(i);
            }
        }
    }
}
