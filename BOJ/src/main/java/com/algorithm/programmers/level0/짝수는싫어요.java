package com.algorithm.programmers.level0;

import java.util.stream.IntStream;

public class 짝수는싫어요 {
    public static void main(String[] args) {
        System.out.println(solution(10)); //[1, 3, 5, 7, 9]
        System.out.println(solution(15)); //[1, 3, 5, 7, 9, 11, 13, 15]
    }

    public static int[] solution(int n) {
        int[] answer = {};
        answer = IntStream.rangeClosed(1, n).filter(x -> x % 2 != 0)
                .sorted().toArray();
        return answer;
    }
}
