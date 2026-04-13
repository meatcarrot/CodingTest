package BOJ.week08.BOJ_11726_2xn타일링;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [] dp = new int [N+1];

        if(N==1){
            System.out.print(1);
            return;
        }
        if(N==2){
            System.out.print(2);
            return;
        }
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= N; i++){
            dp[i] = (dp[i-2] + dp[i-1])%10007;
        }

        System.out.print(dp[N]);
    }
}
