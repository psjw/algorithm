package programmers.코딩테스트합격자되기;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10},  5)));
        System.out.println(Arrays.toString(solution(new int[]{2, 36, 1, 3},  1)));
        System.out.println(Arrays.toString(solution(new int[]{3,2,6},  10)));
    }

    static int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0){
                result.add(arr[i]);
            }
        }

        System.out.println(result);

        answer = result.stream().sorted().mapToInt(Integer::intValue).toArray();

        if(answer.length == 0) answer = new int[]{-1};

        return answer;
    }
}
