package programmers.level0;

import java.util.HashSet;

public class 합성수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10)); //5
        System.out.println(solution(15)); //8
    }

    public static int solution(int n) {
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            hashSet.clear();
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    hashSet.add(j);
                    hashSet.add(i / j);
                }
                if (j == (int)Math.sqrt(i) && hashSet.size() >= 3) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
