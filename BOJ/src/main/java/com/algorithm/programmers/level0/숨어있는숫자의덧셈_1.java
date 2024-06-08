package com.algorithm.programmers.level0;

public class 숨어있는숫자의덧셈_1 {
    public static void main(String[] args) {
        System.out.println(solution('aAb1B2cC34oOp')); //10
        System.out.println(solution('1a2b3c4d123')); //16
    }

    private static int solution(String my_string) {
        int answer = 0;
        answer = my_string.chars().filter(Character::isDigit).mapToObj(Character::toString).mapToInt(Integer::valueOf).sum();
        return answer;
    }
}
