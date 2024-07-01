package com.algorithm.programmers.level0;

import java.util.stream.Collectors;

public class 문자열정렬하기_2 {
    public static void main(String[] args) {
        System.out.println(solution("Bcad")); //'abcd'
        System.out.println(solution("heLLo")); //'ehllo'
        System.out.println(solution("Python")); //'hnopty'
    }

    public static String solution(String my_string) {
        String answer = "";
        answer = my_string.chars()
                .mapToObj(Character::toString)
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.joining());
        return answer;
    }
}
