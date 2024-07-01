package com.algorithm.boj.boj_11286;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main_11286 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> absPriorityQueue = new PriorityQueue<>((o1, o2) -> {
            int A = Math.abs(o1);
            int B = Math.abs(o2);
            if(A == B){
                return o1 > o2 ? 1 : -1;
            }else{
                return A - B;
            }
        });
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out))){
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());
            for(int i = 0 ; i < N ; i++){
                int temp = Integer.parseInt(br.readLine());
                if(temp == 0){
                    if(absPriorityQueue.isEmpty()){
                        sb.append("0\n");
                    }else{
                        sb.append(absPriorityQueue.poll() + "\n");
                    }
                }else{
                    absPriorityQueue.add(temp);
                }
            }

            bw.write(sb.toString());
            bw.flush();
        }
    }
}
