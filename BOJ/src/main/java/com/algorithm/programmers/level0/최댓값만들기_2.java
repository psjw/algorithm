package com.algorithm.programmers.level0;

import java.util.Arrays;
import java.util.Comparator;

public class 최댓값만들기_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, -3, 4, -5})); //15
        System.out.println(solution(new int[]{0, -31, 24, 10, 1, 9})); //240
        System.out.println(solution(new int[]{10, 20, 30, 5, 5, 20, 5})); //600
    }

    public static int solution(int[] numbers) {
        int answer = 0;
        int[] sortedNumbers = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).mapToInt(x->x).toArray();
        answer = Math.max(sortedNumbers[0] * sortedNumbers[1], sortedNumbers[numbers.length-1] * sortedNumbers[numbers.length-2]);
        return answer;
    }
}
