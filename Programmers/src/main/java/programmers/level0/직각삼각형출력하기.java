package programmers.level0;


import java.util.Scanner;
import java.util.stream.IntStream;

public class 직각삼각형출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, n).forEach(index -> {
            IntStream.rangeClosed(0, index).forEach(x -> {
                sb.append('*');
            });
            sb.append('\n');
        });
        System.out.println(sb.toString());
    }
}
