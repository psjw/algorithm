package com.algorithm.programmers.level0;

public class 문자열뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5})); //[5, 4, 3, 2, 1]
        System.out.println(solution(new int[]{1, 1, 1, 1, 1, 2})); //[2, 1, 1, 1, 1, 1]
        System.out.println(solution(new int[]{1, 0, 1, 1, 1, 3, 5})); //[5, 3, 1, 1, 1, 0, 1]
    }

    public static int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - i - 1];
        }


        return answer;
    }
}
