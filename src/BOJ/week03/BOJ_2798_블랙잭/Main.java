package BOJ.week03.BOJ_2798_블랙잭;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int [] box = new int [N];

        for ( int i = 0; i < N; i++){
            box[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        for ( int i = 0; i < N-2; i++){
            for (int j = i+1; j < N-1; j++){
                for (int k = j+1; k < N; k++){
                    int current = box[i] + box[j] + box[k];
                    if (current > M) {
                        continue;
                    }
                    else if (current > result) {
                        result = current;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
