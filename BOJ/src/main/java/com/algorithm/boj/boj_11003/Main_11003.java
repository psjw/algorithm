package com.algorithm.boj.boj_11003;

import java.io.*;
import java.util.*;

public class Main_11003 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Deque<Node> deque = new LinkedList<>();
            int N = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int temp = Integer.parseInt(st.nextToken());

                while (!deque.isEmpty() && deque.getLast().value > temp) {
                    deque.removeLast();
                }
                deque.addLast(new Node(temp, i));
                if (deque.getFirst().index <= i - L) {
                    deque.removeFirst();
                }
                bw.write(deque.getFirst().value + '\n');
            }
            bw.flush();
        }
    }

    static class Node {
        private int value;
        private int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
