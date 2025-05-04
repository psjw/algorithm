package pccp.ch02.exmap;


import java.util.HashMap;


public class Ex1MapMain {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 3}));;
        System.out.println(solution(new int[]{3,3,3,2,2,4}));;
        System.out.println(solution(new int[]{3,3,3,2,2,2}));;
    }
    public static int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.size() == (nums.length/2)) {
                break;
            }
        }
        answer = map.size();
        return answer;
    }
}
