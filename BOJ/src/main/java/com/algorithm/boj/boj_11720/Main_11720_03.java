package com.algorithm.boj.boj_11720;

import java.io.*;

public class Main_11720_03 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)))) {
            int N = Integer.parseInt(br.readLine());
            String temp = br.readLine();
            int sum = 0;
            for (int i = 0; i < N; i++) {
                int val = Character.getNumericValue(temp.charAt(i));
                sum += val;
            }

            bw.write(String.valueOf(sum));
            bw.flush();
        }
    }
}
