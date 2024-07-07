package programmers.level0;

public class 옷가게할인받기 {
    public static void main(String[] args) {
        System.out.println(solution(150000)); //142500
        System.out.println(solution(580000)); //464000
    }

    public static int solution(int price) {
        int answer = 0;
        if (price >= 100000 && price < 300000) {
            answer = (int) Math.floor(price * 0.95);
        } else if (price >= 300000 && price < 500000) {
            answer = (int) Math.floor(price * 0.9);
        } else if(price >= 500000){
            answer = (int) Math.floor(price * 0.8);
        } else{
            answer = price;
        }
        return answer;
    }
}
