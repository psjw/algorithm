package com.algorithm.programmers.level0;

import java.util.stream.Collectors;

public class 대문자와소문자 {
    public static void main(String[] args) {
        System.out.println(solution('cccCCC')); //CCCccc
        System.out.println(solution('abCdEfghIJ')); //ABcDeFGHij
    }

    public static String solution(String my_string) {
        String answer = '';
        answer = my_string.chars()
                .mapToObj(my_char -> (Character.isUpperCase(my_char) ? Character.toLowerCase(my_char) : Character.toUpperCase(my_char)))
                .map(Character::toString)
                .collect(Collectors.joining());
        return answer;
    }

/*    public static String solution(String my_string) {
        String answer = '';
        StringBuilder sb = new StringBuilder();
        my_string.chars()
                .mapToObj(Character::toString)
                .map(my_char -> {
                    if (Character.isUpperCase(my_char.charAt(0))) {
                        sb.append(my_char.toLowerCase());
                    } else {
                        sb.append(my_char.toUpperCase());
                    }
                    return null;
                }).toArray();
        answer = sb.toString();
        return answer;
    }*/
}
