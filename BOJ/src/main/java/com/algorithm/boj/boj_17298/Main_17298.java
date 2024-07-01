package com.algorithm.boj.boj_17298;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class Main_17298 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).mapToInt(x -> x).toArray();
            Stack<Integer> stack = new Stack<>();
            Stack<Integer> tempStack = new Stack<>();
            for (int i = N - 1; i >= 0; i--) {
                while (!tempStack.isEmpty() && tempStack.peek() <= arr[i]) {
                    tempStack.pop();
                }
                if (tempStack.isEmpty()) {
                    stack.add(-1);
                } else {
                    stack.add(tempStack.peek());
                }
                tempStack.push(arr[i]);
            }
            while(!stack.isEmpty()){

                bw.write(stack.pop()+' ');
            }
            bw.flush();
        }
    }
}
