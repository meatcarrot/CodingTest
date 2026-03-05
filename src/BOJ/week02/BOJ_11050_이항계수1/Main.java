package BOJ.week02.BOJ_11050_이항계수1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int head = 1;
        for ( int i = 1; i <= N; i++){
            head = head*i;
        }

        int bottom1 = 1;
        int bottom2 = 1;


        for ( int i = 1; i <= k; i++){
            bottom1 = bottom1*i;
        }

        for ( int i = 1; i <= N-k; i++) {
            bottom2 = bottom2 * i;
        }

        System.out.println(head/(bottom2*bottom1));
    }
}
