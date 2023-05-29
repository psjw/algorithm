package com.algorithm.programmers.level0;

import java.util.stream.Collectors;

public class A로B만들기 {
    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello")); //1
        System.out.println(solution("allpe", "apple")); //0
    }

    private static int solution(String before, String after) {
        int answer = 0;
        before = before.chars().sorted().mapToObj(Character::toString).collect(Collectors.joining());
        after = after.chars().sorted().mapToObj(Character::toString).collect(Collectors.joining());
        if(before.equals(after)){
            answer = 1;
        }
        return answer;
    }


}
