package pccp.ch03.exmap;


import java.util.HashMap;
import java.util.Map;


public class Ex1Sol1MapMain {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 3}));
        ;
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 4}));
        ;
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 2}));
        ;
    }

    public static int solution(int[] nums) {
        // [3,1,2,3]
        // [1,2,3] : 3개
        // N/2 : 2개
        // 포켓몬 종류의 개수를 구한다.
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, 0);
        }
        int n1 = map.keySet().size();

        // 배열 크기의 1/2을 구한다.
        int n2 = nums.length / 2;

        // 최소값을 선택한다.
        return Math.min(n1, n2);
    }
}
