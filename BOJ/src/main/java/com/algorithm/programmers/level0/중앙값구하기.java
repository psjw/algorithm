package com.algorithm.programmers.level0;

import java.util.Arrays;

public class 중앙값구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 7, 10, 11})); //7
        System.out.println(solution(new int[]{9, -1, 0})); //0
    }

    private static int solution(int[] array) {
        int answer = 0;
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        answer = sortedArray[array.length / 2];
        return answer;
    }
}
