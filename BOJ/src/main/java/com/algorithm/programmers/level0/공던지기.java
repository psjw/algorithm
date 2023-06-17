package com.algorithm.programmers.level0;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class 공던지기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}, 5)); //3
        System.out.println(solution(new int[]{1, 2, 3, 4}, 2)); //3
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6}, 5)); //3
        System.out.println(solution(new int[]{1, 2, 3}, 3)); //2
        System.out.println(solution(new int[]{1, 2}, 1)); //2
    }

    public static int solution(int[] numbers, int k) {
        int answer = 0;
        //1,3,5,1,3
        int length = numbers.length;
        int count = 1;
        for (int i = 1; i < 1001 * 2; i += 2) {
            if (count == k) {
                if (i > length && i % length > 0) {
                    answer = i % length;
                } else if (i % length == 0) {
                    answer = length;
                } else {
                    answer = i;
                }
                break;
            }
            count++;

        }
        return answer;
    }
}
