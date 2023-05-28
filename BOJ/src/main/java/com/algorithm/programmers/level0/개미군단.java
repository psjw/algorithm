package com.algorithm.programmers.level0;

public class 개미군단 {
    public static void main(String[] args) {
        System.out.println(solution(23)); //5
        System.out.println(solution(24)); //6
        System.out.println(solution(999)); //201
    }

    public static int solution(int hp) {
        int answer = 0;
        //장군 : 5 / 변정 : 3 / 일개미 : 1
        int firstAttackCount = (hp / 5);

        int secondAttackCount = (hp - (firstAttackCount * 5)) / 3;

        int lastAttackCount = hp - (firstAttackCount * 5) - (secondAttackCount * 3);
        answer = firstAttackCount + secondAttackCount + lastAttackCount;
        return answer;
    }
}
