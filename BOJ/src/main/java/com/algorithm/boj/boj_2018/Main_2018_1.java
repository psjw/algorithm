package com.algorithm.boj.boj_2018;

import java.io.*;

public class Main_2018_1 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out))){
            int N = Integer.parseInt(br.readLine());
            int startIdx = 1;
            int endIdx = 1;
            int sum = 1;
            int count = 1;
            while (endIdx != N) {
                if(sum > N){
                    sum -= startIdx;
                    startIdx++;
                }else   if(sum < N){
                    endIdx++;
                    sum += endIdx;
                }else if(sum == N){
                    count++;
                    endIdx++;
                    sum += endIdx;
                }
            }

            bw.write(String.valueOf(count));
            bw.flush();

        }
    }
}
