package programmers.코딩테스트합격자되기;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public static void main(String[] args) {
        System.out.println(solution(2, 10, new int[]{7, 4, 5, 6}));
        System.out.println(solution(100, 100, new int[]{10}));
        System.out.println(solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }

    static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridgeQueue = new LinkedList<>();
        for (int i = 0; i < bridge_length; i++) {
            bridgeQueue.add(0);
        }
        int index = 0;
        int currentWeight = 0;
        while (!bridgeQueue.isEmpty()) {
            answer++;
            Integer truckWeight = bridgeQueue.poll();
            currentWeight -= truckWeight;
            if (index < truck_weights.length && currentWeight + truck_weights[index] > 0) {
                if (currentWeight + truck_weights[index] <= weight) {
                    currentWeight += truck_weights[index];
                    bridgeQueue.add(truck_weights[index]);
                    index++;
                } else {
                    bridgeQueue.add(0);
                }
            }
        }

        return answer;
    }

}
