package com.algorithm.programmers.level0;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class 가장큰수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 8, 3})); //[8,1]
        System.out.println(solution(new int[]{9, 10, 11, 8})); //[11,2]
    }

    public static int[] solution(int[] array) {
        int[] answer = {};
        answer = new int[2];
        AtomicInteger max = new AtomicInteger();
        AtomicInteger maxIndex = new AtomicInteger();
        IntStream.range(0, array.length)
                .forEach(index -> {
                    if(array[index] >max.get()){
                        maxIndex.set(index);
                        max.set(Math.max(array[index],max.get()));
                    }
                });
        answer[0] = max.get();
        answer[1] = maxIndex.get();
        return answer;
    }
}
