package com.algorithm.programmers.level0;

import java.util.stream.Collectors;

public class 중복된문자제거 {
    public static void main(String[] args) {
        System.out.println(solution("people")); //'peol'
        System.out.println(solution("We are the world")); //'We arthwold'
    }

    public static String solution(String my_string) {
        String answer = "";
        answer = my_string.chars().distinct().mapToObj(Character::toString).collect(Collectors.joining());
        return answer;
    }
}
