package com.algorithm.boj.boj_1253;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1253_1 {
    private static int N;
    private static long[] arr;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int answer = 0;

            for (int k = 0; k < N; k++) {
                int start = 0;
                int end = N-1;
                long find = arr[k];
                while(end > start) {
                    long sum = arr[start] + arr[end];
//                    System.out.println("start : " + start + " end : " + end + " sum : " + sum + " find : " + find+ " k : " + k);
                    if (sum < find) {
                        start++;
                    } else if (sum > find) {
                        end--;
                    } else {
                       if(start != k && end != k){
                           answer++;
                           break;
                       }else if(start == k){
                           start++;
                       }else if(end == k){
                           end--;
                       }
                    }
                }
            }

            bw.write(String.valueOf(answer));
            bw.flush();
        }
    }
}
