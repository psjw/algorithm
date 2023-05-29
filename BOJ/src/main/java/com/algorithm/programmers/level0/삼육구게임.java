package com.algorithm.programmers.level0;

public class 삼육구게임 {
    public static void main(String[] args) {
        System.out.println(solution(3)); //1
        System.out.println(solution(29423)); //2
        System.out.println(solution(10)); //0
    }

    public static int solution(int order) {
        int answer = 0;
        answer = (int)String.valueOf(order).chars().mapToObj(Character::toString)
                .mapToInt(Integer::parseInt)
                .filter(x -> x > 0)
                .filter(x -> x % 3 == 0)
                .count();
        return answer;
    }
}
