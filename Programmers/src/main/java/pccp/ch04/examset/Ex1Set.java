package pccp.ch04.examset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex1Set {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 7, 32, 43, 22, 19}));
        System.out.println(solution(new int[]{3, 19, 34, 39, 39, 20}));
    }
    private static boolean solution(int[] lotto) {
        boolean answer = true;
        Set<Integer> set = new HashSet<>();
        Arrays.stream(lotto).forEach(set::add);
        if(set.size() != lotto.length) {
            answer = false;
        }
        return answer;
    }
}
