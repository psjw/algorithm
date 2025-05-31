package pccp.ch04.examset;

import java.util.*;

public class Ex3Set {
    public static void main(String[] args) {
        solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        solution(new int[]{4, 4, 4, 3, 3});
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                result.add(arr[i]);
                set.clear();
                set.add(arr[i]);
            }
        }
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
