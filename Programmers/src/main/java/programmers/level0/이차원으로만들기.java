package programmers.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 이차원으로만들기 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)); //[[1, 2], [3, 4], [5, 6], [7, 8]]
        System.out.println(solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3)); //[[100, 95, 2], [4, 5, 6], [18, 33, 948]]
    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        int count = 0;
        answer = new int[num_list.length / n][n];
        for (int k = 0; k < num_list.length / n; k++) {
            count = 0;
            for (int i = k*n; i < k*n+n; i++) {
                answer[k][count] = num_list[i];
                count++;
            }
        }
        return answer;
    }
}
