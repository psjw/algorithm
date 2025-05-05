package pccp.ch02.exmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Ex3MapMain {
    public static void main(String[] args) {
        System.out.println(solution(new String[][]{{"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"}, {"blue_sunglasses", "eyewear"}}));
        System.out.println(solution(new String[][]{{"crow_mask", "face"},
                {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
    }

    public static int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String key = clothe[1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int result = 1;
        Iterator<Integer> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            result = result * (iterator.next() + 1);
        }

        answer = result - 1;
        return answer;
    }
}
