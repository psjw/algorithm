package programmers.level0;

import java.util.Arrays;

public class 중복된숫자개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 2, 3, 4, 5},1)); //2
        System.out.println(solution(new int[]{0,2,3,4},1)); //0
    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        answer = (int)Arrays.stream(array).filter(x -> x == n).count();
        return answer;
    }
}
