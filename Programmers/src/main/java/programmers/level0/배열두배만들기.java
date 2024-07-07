package programmers.level0;

import java.util.Arrays;

public class 배열두배만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5})); //	[2, 4, 6, 8, 10]
        System.out.println(solution(new int[]{1, 2, 100, -99, 1, 2, 3})); //[2, 4, 200, -198, 2, 4, 6]
    }

    private static int[] solution(int[] numbers) {
        int[] answer = {};
        answer = Arrays.stream(numbers).mapToObj(x -> x * 2).mapToInt(x -> x).toArray();
        return answer;
    }
}
