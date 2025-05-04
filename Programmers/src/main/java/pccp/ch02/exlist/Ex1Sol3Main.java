package pccp.ch02.exlist;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex1Sol3Main {
    public static void main(String[] args) {
        //최댓값 인덱스 구하기
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5, 4, 5, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{3, 6, 10, 1, 7, 2, 4, 6, 10, 9})));
    }

    public static int[] solution(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        return  IntStream.range(0, arr.length)
                .filter(i -> arr[i] == max).toArray();
    }
}
