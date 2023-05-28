package com.algorithm.programmers.level0;

import java.util.Arrays;

public class 배열의평균값 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})); //5.5
        System.out.println(solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99})); //94.0
    }

    private static double solution(int[] numbers) {
        double answer = 0;
        answer = Arrays.stream(numbers).average().getAsDouble();
        return answer;
    }
}
