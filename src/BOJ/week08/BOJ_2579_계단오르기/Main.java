package BOJ.week08.BOJ_2579_계단오르기;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] stairs = new int [N];

        for(int i = 0; i < N; i++){
            stairs[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int [N];

        if (N == 1) {
            System.out.print(stairs[0]);
            return;
        }

        dp[0] = stairs[0];
        dp[1] = stairs[0] + stairs[1];

        if (N == 2){
            System.out.print(dp[1]);
            return;
        }

        dp[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);

        for(int i = 3; i < N; i++){
            dp[i] = Math.max(
                    dp[i-3] + stairs[i-1] + stairs[i],
                    dp[i-2] + stairs[i]);
        }

        System.out.print(dp[N-1]);
    }
}
