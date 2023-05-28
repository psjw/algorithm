package com.algorithm.programmers.level0;

import java.util.Arrays;

public class n의배수고르기 {
    public static void main(String[] args) {
        System.out.println(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})); //[6, 9, 12]
        System.out.println(solution(5, new int[]{1, 9, 3, 10, 13, 5})); //[10, 5]
        System.out.println(solution(12, new int[]{2, 100, 120, 600, 12, 12})); //[120, 600, 12, 12]
    }

    public static int[] solution(int n, int[] numlist) {
        int[] answer = {};
        answer = Arrays.stream(numlist).filter(number -> number % n == 0).toArray();
        return answer;
    }
}
