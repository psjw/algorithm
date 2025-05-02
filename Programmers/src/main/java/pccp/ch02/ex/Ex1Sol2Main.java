package pccp.ch02.ex;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex1Sol2Main {
    public static void main(String[] args) {
        //최댓값 인덱스 구하기
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5, 4, 5, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{3, 6, 10, 1, 7, 2, 4, 6, 10, 9})));
    }

    public static int[] solution(int[] arr) {
        // 최대값 구하기
        int max = Arrays.stream(arr).max().getAsInt();
//        int max = 0;
//        for (int a : arr) {
//            if (a > max) max = a;
//        }
        //리스트 만들기
        List<Integer> list = new LinkedList<>();
        // 배열의 인덱스 채우기
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                list.add(i);
            }
        }
        //리스트를 배열로 변환
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
//        int[] answer = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            answer[i] = list.get(i);
//        }
        return answer;
    }
}
