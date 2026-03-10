package BOJ.week03.BOJ_7568_덩치;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int [] W = new int [N];
        int [] H = new int [N];

        int [] S = new int [N];

        for ( int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            W[i] = Integer.parseInt(st.nextToken());
            H[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            int count = 0;
            for(int j = 0; j < N; j++){
                if(W[i] < W[j] && H[i] < H[j]){
                    count++;
                }
            }
            S[i] = count+1;
        }
        for(int i = 0; i < N; i++){
            System.out.print(S[i]+" ");
        }


    }
}
