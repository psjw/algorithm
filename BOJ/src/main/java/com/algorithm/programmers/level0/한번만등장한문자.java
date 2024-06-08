package com.algorithm.programmers.level0;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class 한번만등장한문자 {
    public static void main(String[] args) {
        System.out.println(solution('abcabcadc')); //'d'
        System.out.println(solution('abdc')); //'abcd'
        System.out.println(solution('hello')); //'eho'
        System.out.println(solution('baaaab')); //''

    }

    public static String solution(String s) {
        String answer = '';
        Map<String, Integer> hmap = new HashMap<>();

        s.chars().mapToObj(Character::toString).forEach(x -> {
            hmap.put(x, hmap.getOrDefault(x, 0) + 1);
        });
        StringBuilder sb = new StringBuilder();
        hmap.entrySet().stream().filter(x -> x.getValue() == 1).sorted(Map.Entry.comparingByKey())
                .forEach(x -> sb.append(x.getKey()));

        answer = sb.toString();
        return answer;
    }
}
