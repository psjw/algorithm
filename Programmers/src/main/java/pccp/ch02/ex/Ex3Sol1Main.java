package pccp.ch02.ex;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex3Sol1Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }

    public static int[] solution(long n) {
        List<Integer> list = new LinkedList<>();
        while (n > 0) {
            list.add((int) (n % 10));
            n /= 10;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
