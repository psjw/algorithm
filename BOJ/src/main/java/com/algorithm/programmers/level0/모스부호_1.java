package com.algorithm.programmers.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 모스부호_1 {
    public static void main(String[] args) {
        System.out.println(solution('.... . .-.. .-.. ---')); //'hello'
        System.out.println(solution('.--. -.-- - .... --- -.')); //'We python'
    }

    public static String solution(String letter) {
        String answer = '';
        String[] morse = {'.-','-...','-.-.','-..','.','..-.',
                '--.','....','..','.---','-.-','.-..','--','-.',
                '---','.--.','--.-','.-.','...','-','..-','...-',
                '.--','-..-','-.--','--..'};

        Map<String, String> hmap = new HashMap<>(); //97~122
        IntStream.range(0, morse.length)
                        .forEach(x -> hmap.put(morse[x], Character.toString((char)(x+97))));

        answer = Arrays.stream(letter.split(' '))
                .map(x -> hmap.get(x))
                .collect(Collectors.joining());
        return answer;
    }
}
