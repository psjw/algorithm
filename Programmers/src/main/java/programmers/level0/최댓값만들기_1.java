package programmers.level0;

import java.util.Arrays;

public class 최댓값만들기_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3,4,5})); //20
        System.out.println(solution(new int[]{0, 31, 24, 10, 1, 9})); //744
    }

    private static int solution(int[] numbers) {
        int answer = 0;
        int[] sortedNumbers = Arrays.stream(numbers).sorted().toArray();
        answer = sortedNumbers[numbers.length - 1] * sortedNumbers[numbers.length - 2];
        return answer;
    }
}
