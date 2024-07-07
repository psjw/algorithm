package programmers.level0;

public class 피자나눠먹기_2 {
    public static void main(String[] args) {
        System.out.println(solution(6)); //1
        System.out.println(solution(10)); //5
        System.out.println(solution(4)); //2
    }

    public static int solution(int n) {
        int answer = 0;
        //최대공배수 = n * 6 / 최대공약수(n, 6)

        answer = n * 6 / gdc(n, 6);
        answer /= 6;
        return answer;
    }

    private static int gdc(int n, int i) {
        if(n < i){
            int temp = n;
            n = i;
            i = temp;
        }
        while(i != 0){
            int r = n % i;
            n = i;
            i = r;
        }
        return n;
    }
}
