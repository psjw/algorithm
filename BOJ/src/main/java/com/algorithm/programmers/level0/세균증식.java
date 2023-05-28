package com.algorithm.programmers.level0;

import java.util.stream.IntStream;

public class 세균증식 {
    public static void main(String[] args) {
        System.out.println(solution(2, 10)); //2048
        System.out.println(solution(7, 15)); //229,376
    }

    public static int solution(int n, int t) {
        int answer = 0;
        answer = (int)Math.pow(2, t) * n;

        return answer;
    }
}
