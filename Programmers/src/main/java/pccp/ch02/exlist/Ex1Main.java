package pccp.ch02.exlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1Main {
    public static void main(String[] args) {
        //최댓값 인덱스 구하기
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5, 4, 5, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{3, 6, 10, 1, 7, 2, 4, 6, 10, 9})));
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                list.clear();
                max = arr[i];
                list.add(i);
            } else if (arr[i] == max) {
                list.add(i);
            }
        }

        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
