package com.algorithm.programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 칠의개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 77, 17})); //4
        System.out.println(solution(new int[]{10, 29})); //0
    }

    public static int solution(int[] array) {
        int answer = 0;
        answer = (int)Arrays.stream(array)
                .mapToObj(x -> String.valueOf(x).chars().filter(ch -> ch == 55).count())
                .collect(Collectors.toList()).stream().mapToLong(x -> x).sum();
        return answer;
    }
}
