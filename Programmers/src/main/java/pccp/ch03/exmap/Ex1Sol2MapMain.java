package pccp.ch03.exmap;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Ex1Sol2MapMain {
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
        List<Integer> list = new LinkedList<>();
        for (int n : nums) {
            if(!list.contains(n)) { list.add(n); }
        }
        int n1 = list.size();

        // 배열 크기의 1/2을 구한다.
        int n2 = nums.length / 2;

        // 최소값을 선택한다.
        return Math.min(n1, n2);
    }
}
