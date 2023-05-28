package com.algorithm.programmers.level0;

import java.nio.CharBuffer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 배열회전시키기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}, "right")); //[3, 1, 2]
        System.out.println(solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")); //[455, 6, 4, -1, 45, 6, 4]
    }

    public static int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        answer = new int[numbers.length];
        if ("right".equals(direction)) {
            for (int i = 0; i < numbers.length; i++) {
                if (i == numbers.length - 1) {
                    answer[0] = numbers[i];
                } else {
                    answer[i + 1] = numbers[i];
                }
            }
        }
        if ("left".equals(direction)) {
            for (int i = numbers.length - 1; i > 0; i--) {
                if (i == numbers.length - 1) {
                    answer[i] = numbers[0];
                    answer[i - 1] = numbers[i];
                } else {
                    answer[i - 1] = numbers[i];
                }
            }
        }

        return answer;
    }
}
