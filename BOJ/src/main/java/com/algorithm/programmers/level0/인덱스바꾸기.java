package com.algorithm.programmers.level0;

import java.nio.CharBuffer;
import java.util.stream.Collectors;

public class 인덱스바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution('hello',1,2)); //hlelo
        System.out.println(solution('I love you',3,6)); //I l veoyou

    }
    public static String solution(String my_string, int num1, int num2) {
        String answer = '';
        char[] my_chars = my_string.toCharArray();
        char temp = my_chars[num1];
        my_chars[num1] = my_chars[num2];
        my_chars[num2] = temp;
        answer = CharBuffer.wrap(my_chars).chars().mapToObj(Character::toString)
                .collect(Collectors.joining());
        return answer;
    }
}
