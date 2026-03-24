package BOJ.week04.BOJ_10815_숫자카드;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashSet<Integer> sang = new HashSet();

        for ( int i = 0; i < N; i++){
            sang.add(Integer.parseInt(st.nextToken()));
        }

        int M =  Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int [] guess = new int[M];

        for ( int i = 0; i < M; i++){
            guess[i] = Integer.parseInt(st.nextToken());
        }

        for ( int i = 0; i < M; i++){
            if(sang.contains(guess[i])){
                guess[i] = 1;
            }
            else{
                guess[i] = 0;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++){
            sb.append(guess[i]).append(" ");
        }
        System.out.print(sb);
    }
}
