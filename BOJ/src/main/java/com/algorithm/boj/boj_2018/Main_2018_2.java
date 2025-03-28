package com.algorithm.boj.boj_2018;

import java.io.*;

public class Main_2018_2 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            int start = 0;
            int end = start;
            int arr[] = new int[N + 1];
            int sum = 1;

            for (int i = 0; i < N; i++) {
                arr[i] = i + 1;
            }


            while (end != N) {
                if (sum > N) {
                    sum -= arr[start];
                    start++;
                } else if (sum < N) {
                    end++;
                    sum += arr[end];
                } else if (sum == N) {
                    end++;
                    sum += arr[end];
                    count++;
                }
            }

            bw.write(String.valueOf(count));
            bw.flush();
        }
    }
}
