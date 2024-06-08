package com.algorithm.boj.boj_1874;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main_1874 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            int N = Integer.parseInt(br.readLine());
            int index = 1;
            for (int i = 0; i < N; i++) {
                int temp = Integer.parseInt(br.readLine());

                for (int j = index; j <= temp; j++) {
                    stack.push(j);
                    sb.append('+\n');
                    if(j ==  temp){
                        index = temp+1;
                    }
                }

                if (stack.peek() == temp) {
                    stack.pop();
                    sb.append('-\n');
                }
            }

            if(stack.size() > 0){
                bw.write('NO\n');
            }else{
                bw.write(sb.toString());
            }
            bw.flush();
        }
    }
}
