package com.algorithm.boj.boj_2164;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main_2614 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 1; i <= N; i++) {
                queue.add(i);
            }
            int queueSize = queue.size();
            int answer = 0;
            int count = 1;
            while(queue.size() > 1){
                if (count % 2 != 0) {
                    queue.poll();
                } else {
                    int temp = queue.poll();
                    queue.add(temp);
                }
                count++;
            }

            bw.write(queue.poll()+"\n");
            bw.flush();
        }
    }
}
