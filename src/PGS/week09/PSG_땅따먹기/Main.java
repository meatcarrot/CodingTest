package PGS.week09.PSG_땅따먹기;
import java.util.*;
public class Main {

    class Solution {
        int solution(int[][] land) {
            int N = land.length;

            int [][] dp = new int [N][4];

            for(int j = 0; j < 4; j++){
                dp[0][j] = land[0][j];
            }


            for(int i = 1; i < N; i++) {
                for(int j = 0; j < 4; j++){

                    for(int k = 0; k < 4; k++){
                        if(k != j){
                            dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + land[i][j]);
                        }
                    }
                }
            }

            int max = 0;

            for(int i = 0; i < 4; i++){
                max = Math.max(max, dp[N-1][i]);
            }
            System.out.print(max);
            return max;
        }
    }
}
