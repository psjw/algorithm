package com.algorithm.programmers.level0;

import java.util.stream.Collectors;

public class 특정문자제거하기 {
    public static void main(String[] args) {
        System.out.println(solution('abcdef', 'f')); //abcde
        System.out.println(solution('BCBdbe', 'B')); //Cdbe

    }

    public static String solution(String my_string, String letter) {
        String answer = '';
        answer = my_string.chars().filter(my_char -> my_char != letter.charAt(0))
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
        return answer;
    }
}
