package BOJ.week08.BOJ_12865_평범한배낭;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int [][] bags = new int[N+1][2];
        int [][] dp = new int [N+1][K+1];


        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            bags[i][0] = Integer.parseInt(st.nextToken());
            bags[i][1] = Integer.parseInt(st.nextToken());

        }

        // i번째 물건을 안 넣는 경우 -> dp[i-1][w]
        // i번째 물건 넣는 경우 -> i-1번째의 무게 한도는? 거기에 i번째 물건 가치를 더한다
        // dp[i-1][w - bags[i][0]] + bags[i][1]

        for(int i = 1; i <= N; i++){
            for(int w = 0; w <= K; w++){
                if(w < bags[i][0]){
                    dp[i][w] = dp[i-1][w];
                }
                else {
                    dp[i][w] = Math.max(dp[i-1][w],
                            dp[i-1][w - bags[i][0]] + bags[i][1]);
                }
            }
        }
        System.out.print(dp[N][K]);


    }
}
