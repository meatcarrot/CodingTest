package BOJ.week05.BOJ_2805_나무자르기;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] trees = new int [N];
        st = new StringTokenizer(br.readLine());

        int max = 0;

        for(int i = 0; i < N; i++){
            trees[i] = Integer.parseInt(st.nextToken());
            if(trees[i] > max) max = trees[i];
        }

        int start = 0;
        int end = max;
        int answer = 0;

        while(start <= end){
            int high = (start + end) / 2;
            Long sum = 0L;

            for (int tree : trees){
                if (tree > high){
                    sum += tree - high;
                }
            }

            if ( sum >= M){
                answer = high;
                start = high + 1;
            }
            else{
                end = high - 1;
            }
        }

        System.out.print(answer);




    }
}
