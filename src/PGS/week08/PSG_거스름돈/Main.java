package PGS.week08.PSG_거스름돈;
import java.util.*;

public class Main {


    class Solution {
        public int solution(int n, int[] money) {

            int [] dp = new int [100001];
            dp[0] = 1;

            Arrays.sort(money);

            for (int coin : money) {
                for(int i = coin; i <= n; i++){
                    dp[i] = (dp[i] + dp[i-coin])% 1000000007;
                }
            }

            return dp[n];
        }
    }
}
