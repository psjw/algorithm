package com.algorithm.boj.boj_2606;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main_2606 {

    static int visit[];
    static int graph[][];
    static int N, M;
    static int answer;

    public static void main(String[] args) throws IOException {
        //0. 입력 및 초기화
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            N = Integer.parseInt(br.readLine());
            M = Integer.parseInt(br.readLine());
            visit = new int[N + 1];
            graph = new int[N + 1][N + 1];

            //1. graph에 연결정보 채우기
            for (int i = 0; i < M; i++) {
                String[] temp = br.readLine().split(" ");
                int x = Integer.parseInt(temp[0]);
                int y = Integer.parseInt(temp[1]);
                graph[x][y] = 1;
                graph[y][x] = 1;
            }

            //2. dfs(재귀함후 호출)
            dfs(1);

            //3. 출력
            answer  = Arrays.stream(visit).sum() - 1;
            bw.write(String.valueOf(answer));
            bw.flush();
        }
    }

    private static void dfs(int start) {
        visit[start] = 1;
        for (int i = 1; i <= N; i++) {
            if(visit[i] == 0 && graph[start][i] > 0){
                dfs(i);
            }
        }
    }

}
