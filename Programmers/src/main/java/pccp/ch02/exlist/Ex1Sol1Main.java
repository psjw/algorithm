package pccp.ch02.exlist;

import java.util.Arrays;

public class Ex1Sol1Main {
    public static void main(String[] args) {
        //최댓값 인덱스 구하기
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5, 4, 5, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{3, 6, 10, 1, 7, 2, 4, 6, 10, 9})));
    }

    public static int[] solution(int[] arr) {
        // 최대값 구하기
        int max = 0;
        for (int a : arr) {
            if (a > max) max = a;
        }
        // 최대값이 몇개인지 확인하기
        int count = 0;
        for (int a : arr) {
            if (a == max) count++;
        }
        // 배열 만들기
        int[] answer = new int[count];
        // 배열의 인덱스 채우기
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                answer[index++] = i;
            }
        }

        return answer;
    }
}
