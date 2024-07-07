package programmers.level0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class 최빈값구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 3, 3, 4})); // 3
        System.out.println(solution(new int[]{1, 1, 2, 2})); // -1
        System.out.println(solution(new int[]{1})); // 1
//        System.out.println(solution(new int[]{})); // 1
        System.out.println(solution(new int[]{80, 80, 80, 9, 9})); // 80
        System.out.println(solution(new int[]{2, 3, 1, 2, 4, 3})); // -1
        System.out.println(solution(new int[]{0})); // 1
    }

    public static int solution(int[] array) {
        int answer = -1;
        int result[] = new int[1001];
        int maxCount = 0;
        Arrays.stream(array).forEach(x -> result[x]++);
        int max = Arrays.stream(result).max().getAsInt();
        for (int i = 0; i < result.length; i++) {
            if(max == result[i]){
                answer = i;
                maxCount++;
            }
        }
        if(maxCount > 1){
            answer = -1;
        }
        return answer;
    }
}
