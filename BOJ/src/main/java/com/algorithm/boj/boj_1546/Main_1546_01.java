package com.algorithm.boj.boj_1546;

import java.io.*;
import java.util.StringTokenizer;
public class Main_1546_01 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            double N = Double.parseDouble(br.readLine());  //최고점
            StringTokenizer st = new StringTokenizer(br.readLine());
            double max = 0F;
            double sum = 0F;
            for(int i = 0; i<N ;i++){
                double temp = Double.parseDouble(st.nextToken());
                sum += temp;
                max = Math.max(temp, max);
            }
            double avg = ((sum*100)/ max) / N;
            bw.write(avg + '\n');
            bw.flush();
        }
    }
}
