package com.algorithm.boj.boj_11659;

import java.io.*;
import java.util.StringTokenizer;

public class Main_11659_1 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int result = 0;
            int sumArr[] = new int[N + 1];

            st = new StringTokenizer(br.readLine());

            for(int i = 1; i<=N; i++){
                int temp = Integer.parseInt(st.nextToken());
                sumArr[i] = sumArr[i-1] + temp;
            }

            for(int i = 1; i<=M; i++){

                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());

                result = sumArr[end] - sumArr[start -1];
                bw.write(String.valueOf(result));
                bw.newLine();
            }

            bw.flush();
        }
    }
}
