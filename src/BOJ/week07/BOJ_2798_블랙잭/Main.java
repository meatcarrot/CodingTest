package BOJ.week07.BOJ_2798_블랙잭;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int [] card = new int[N];
        for(int i = 0; i < N; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;

        for(int i = 0; i < N-2; i++){
            for(int j = i+1; j < N-1; j++){
                for(int k = j+1; k < N; k++){
                    int current = card[i] + card[j] + card[k];
                    if(current == M){
                        sum = current;
                        System.out.print(sum);
                        return;
                    }
                    if(current < M && current >sum){
                        sum = current;
                    }
                }
            }
        }
        System.out.print(sum);
    }
}
