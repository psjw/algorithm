package com.algorithm.boj.boj_10158;

import java.io.*;

public class Main_10158 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out))){
            String[] area = br.readLine().split(" ");
            String[] start = br.readLine().split(" ");
            int time = Integer.parseInt(br.readLine());

            int width = Integer.parseInt(area[0]);
            int height = Integer.parseInt(area[1]);
            int[][] map = new int[width+1][height+1];
            boolean[][] visit = new boolean[width+1][height+1];
            int startX = Integer.parseInt(start[0]);
            int startY = Integer.parseInt(start[1]);
            int x[] = {1, -1, -1, 1};
            int y[] = {1, 1, -1, -1};
            int nextX = startX;
            int nextY = startY;
            int count = 0;
            int arrowX = x[0];
            int arrowY = y[0];
            visit[startX][startY] = true;
            while (true) {
                nextX = nextX + arrowX;
                nextY = nextY + arrowY;

                if (nextX > width || nextY > height || nextX < 0 || nextY < 0) {
                    nextX -= arrowX;
                    nextY -= arrowY;
                    for (int j = 0; j < 4; j++){
                        arrowX = x[j];
                        arrowY = y[j];
                        nextX += arrowX;
                        nextY += arrowY;
                        if (nextX > width || nextY > height || nextX < 0 || nextY < 0) {
                            nextX -= arrowX;
                            nextY -= arrowY;
                            continue;
                        }
                        if(visit[nextX][nextY]){
                            nextX -= arrowX;
                            nextY -= arrowY;
                            continue;
                        }

                        break;
                    }
                }
                count++;
                visit[nextX][nextY] = true;
                System.out.println(nextX +"//"+nextY);
                if (count == time) {
                    break;
                }

            }

            System.out.println(nextX +"///"+ nextY);


        }
    }
}
