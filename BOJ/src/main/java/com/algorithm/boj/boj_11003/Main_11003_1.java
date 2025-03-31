package com.algorithm.boj.boj_11003;

import java.io.*;
import java.util.*;

public class Main_11003_1 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            int[] answer = new int[N];
            Deque<Node> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            queue.addFirst(new Node(0, arr[0]));
            answer[0] = arr[0];

            for (int i = 1; i < N; i++) {
                while (!queue.isEmpty() && queue.getLast().getValue() > arr[i]) {
                    queue.removeLast();
                }
                queue.addLast(new Node(i, arr[i]));
                if (queue.getFirst().getIndex() <= i - L) {
                    queue.removeFirst();
                }
                answer[i] = queue.getFirst().getValue();
            }

            Arrays.stream(answer).forEach(x -> {
                try {
                    bw.write(String.valueOf(x) + " ");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            bw.flush();

        }

    }

    static class Node {
        int index;
        int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public int getValue() {
            return value;
        }
    }
}
