package com.algorithm.programmers.level0;

import java.util.stream.Collectors;

public class 모음제거 {
    public static void main(String[] args) {
        System.out.println(solution('bus')); //bs
        System.out.println(solution('nice to meet you')); //nc t mt y

    }

    public static String solution(String my_string) {
        String answer = '';
        answer = my_string.chars()
                .filter(my_char -> my_char != 'a')
                .filter(my_char -> my_char != 'e')
                .filter(my_char -> my_char != 'i')
                .filter(my_char -> my_char != 'o')
                .filter(my_char -> my_char != 'u')
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
        return answer;
    }
}
