package programmers.코딩테스트합격자되기;

import java.util.*;
import java.util.stream.Collectors;

public class 실패율 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
        System.out.println(Arrays.toString(solution(4, new int[]{4,4,4,4,4})));
        System.out.println(Arrays.toString(solution(5, new int[]{3,3,3,3,3})));
        System.out.println(Arrays.toString(solution(8, new int[]{1,2,3,4,5,6,7})));
    }

    static int[] solution(int N, int[] stages) {
        int[] answer = {};
        answer = new int[N];

        Arrays.sort(stages);
        Map<Integer, Double> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            map.put(i, 0.0);
        }
        for (int stage : stages) {
            int index = stage > N ? N - 1 : stage - 1;
            if (stage > N) {
                map.put(index, map.getOrDefault(index, 0.0));
            } else {
                map.put(index, map.getOrDefault(index, 0.0d) + 1);
            }
        }
        int total = stages.length;
        for (int i = 0; i < answer.length; i++) {
            Double currentValue = map.get(i);
            if(currentValue > 0.0d){
                map.put(i, currentValue / (double) total);
                total -= currentValue.intValue();
            }
        }

        answer = map.entrySet().stream().sorted(Map.Entry.<Integer, Double>comparingByValue().reversed())
                .mapToInt(x -> x.getKey() + 1).toArray();

        return answer;
    }
}
