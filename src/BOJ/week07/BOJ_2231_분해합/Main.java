package BOJ.week07.BOJ_2231_분해합;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;

        // xyz + x + y + z = N
        // x + y + z <= 54
        // xyz + x + y + z <= xyz + 54
        // N <= xyz + 54
        // xyz >= N - 54

        for(int i = N-54; i < N; i++){

            int current = i;
            int sum = current;

            while(current > 0){
                sum += current % 10;
                current /= 10;
            }
            if(sum == N && i < min){
                min = i;
            }
        }

        if(min == Integer.MAX_VALUE){
            min = 0;
        }

        System.out.print(min);

    }
}