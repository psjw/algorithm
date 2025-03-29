package com.algorithm.boj.boj_1940;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1940_1 {
    private static int N, M, answer;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            N = Integer.parseInt(br.readLine());
            M = Integer.parseInt(br.readLine());
            arr = new int[N+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            //1 2 3 4 5 7
            //
            Arrays.sort(arr);
            int start = 1;
            int end = N;

            while (end > start) {
                int sum = arr[start] + arr[end];
                if(sum < M){
                    start++;
                }else if(sum > M){
                    end--;
                }else {
                    answer++;
                    start++;
                }
            }

            bw.write(String.valueOf(answer));
            bw.flush();

        }
    }
}
