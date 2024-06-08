package com.algorithm.boj.boj_2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2018 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            int N = Integer.parseInt(br.readLine());
            int startIdx = 1;
            int endIdx = 1;
            int count = 1;
            int sum = 1;
            while(endIdx != N){
                if(sum == N){
                    count++;
                    sum -= startIdx;
                    startIdx++;
                }
                if(sum < N){
                    endIdx++;
                    sum += endIdx;
                }
                if(sum > N){
                    sum -= startIdx;
                    startIdx++;
                }
            }
            bw.write(count + '\n');
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
