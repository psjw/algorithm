package pccp.ch02.exmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex3Sol1MapMain {
    public static void main(String[] args) {
        System.out.println(solution(new String[][]{{"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"}, {"blue_sunglasses", "eyewear"}}));
        System.out.println(solution(new String[][]{{"crow_mask", "face"},
                {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
    }

    public static int solution(String[][] clothes) {
        // 위장 용품의 종류별 개수를 구한다.
        Map<String, Integer> map = new HashMap<>();
        for (String[] c : clothes) {
//            String name = c[0];
            String type = c[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 각 개수의 + 1을 모두 곱한다.
        int answer = 1;
        Iterator<Integer> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            answer *= iterator.next() + 1;
        }

        // -1 해서 리턴한다.
        return answer - 1;
    }
}
