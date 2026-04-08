package BOJ.week07.BOJ_2231_체스판다시칠하기;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char [][] map = new char[N][M];

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < M; j++){
                map[i][j] = line.charAt(j);
            }
        }
        int min = Integer.MAX_VALUE;
        int current = Integer.MAX_VALUE;

        for(int i = 0; i <= N-8; i++){
            for(int j = 0; j <= M-8; j++){

                int blackStart = 0;
                int whiteStart = 0;

                for(int x = i; x <i+8; x++){
                    for(int y = j; y<j+8; y++){
                        if((x+y) % 2 == 0){
                            if(map[x][y] == 'W'){
                                blackStart++;
                            }
                            else{
                                whiteStart++;
                            }
                        }
                        else{
                            if(map[x][y] == 'B'){
                                blackStart++;
                            }
                            else{
                                whiteStart++;
                            }
                        }
                    }
                }

                current = Math.min(whiteStart, blackStart);
                min = Math.min(min, current);
            }
        }
        System.out.print(min);

    }
}
