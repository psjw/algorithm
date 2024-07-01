package com.algorithm.boj.boj_11660;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;


class Direction {
    int x1 ;
    int y1;
    int x2;
    int y2;

    public Direction(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getX1() {
        return x1;
    }

    public Direction() {
    }

    //수식 D[x2][y2]-D[x1-1][y2]-D[x2][y1-1]+D[x1-1][y1-1];
    public int getSum(int[][] sumArr){
        return  sumArr[x2][y2]  - sumArr[x1-1][y2] - sumArr[x2][y1-1] + sumArr[x1-1][y1-1];
    }

    @Override
    public String toString() {
        return "Direction{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                "}";
    }
}
public class Main_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tempCondition = br.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(tempCondition);
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int[][] arr = new int[N+1][N+1];
        int[][] sumByEachArr = new int[N + 1][N + 1];


        //수식  sumByEachArr[i][j] = sumByEachArr[i-1][j]+sumByEachArr[i][j-1]- sumByEachArr[i-1][j-1]+arr[i][j]
        IntStream.rangeClosed(1, N).forEach(i-> {
            StringTokenizer stk = null;
            try {
                stk = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            StringTokenizer finalStk = stk;
            IntStream.rangeClosed(1, N).forEach(j ->{
                    arr[i][j] = Integer.parseInt(finalStk.nextToken());
                    sumByEachArr[i][j] = sumByEachArr[i-1][j]+sumByEachArr[i][j-1]- sumByEachArr[i-1][j-1]+arr[i][j];

            });
        });
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        IntStream.range(0, M).forEach(index -> {
            try {
                StringTokenizer stk = new StringTokenizer(br.readLine());
                Direction direction = new Direction();
                direction.setX1(Integer.parseInt(stk.nextToken()));
                direction.setY1(Integer.parseInt(stk.nextToken()));
                direction.setX2(Integer.parseInt(stk.nextToken()));
                direction.setY2(Integer.parseInt(stk.nextToken()));
                int sum = direction.getSum(sumByEachArr);
                bw.write(sum+'\n');
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bw.flush();
    }
}
