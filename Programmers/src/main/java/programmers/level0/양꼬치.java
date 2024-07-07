package programmers.level0;

public class 양꼬치 {
    public static void main(String[] args) {
        System.out.println(solution(10,3)); //124000
         System.out.println(solution(64,6)); //768000

    }

    private static int solution(int n, int k) {
        int answer = 0;
        int meat = n * 12000;
        int drink = k * 2000;
        int drinkService = (n / 10) * 2000;
        answer = meat + drink - drinkService;


        return answer;
    }
}
