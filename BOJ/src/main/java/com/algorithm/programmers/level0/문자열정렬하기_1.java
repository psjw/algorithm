package com.algorithm.programmers.level0;

import java.util.Arrays;

public class 문자열정렬하기_1 {
    public static void main(String[] args) {
        System.out.println(solution('hi12392')); //[1, 2, 2, 3, 9]
        System.out.println(solution('p2o4i8gj2')); //	[2, 2, 4, 8]
        System.out.println(solution('abcde0')); //[0]
    }

    public static int[] solution(String my_string) {
        int[] answer = {};
        answer = my_string.chars().filter(Character::isDigit)
                .mapToObj(Character::toString)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        return answer;
    }
}
