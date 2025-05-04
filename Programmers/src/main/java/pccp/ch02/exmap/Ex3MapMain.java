package pccp.ch02.exmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int result = 1;
        for(int i =0 ; i < map.size(); i++){
//            result
        }
        answer = result;
        return answer;
    }
}
