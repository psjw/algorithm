package com.algorithm.programmers.level0;

import java.util.HashSet;

public class 순서쌍의개수 {
    public static void main(String[] args) {
        System.out.println(solution( 20)); //6
        System.out.println(solution(100)); //9
    }

    public static int solution(int n) {
        int answer = 0;
        HashSet<Integer> xSet = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                xSet.add(n / i);
            }
        }
        answer = xSet.size();
        return answer;
    }
}
