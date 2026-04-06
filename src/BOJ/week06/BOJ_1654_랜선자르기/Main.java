package BOJ.week06.BOJ_1654_랜선자르기;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int [] lan = new int [K];


        long sum = 0L;
        for(int i = 0; i < K; i++){
            int n = Integer.parseInt(br.readLine());
            sum += n;
            lan[i] = n;
        }

        long start = 1;
        long end = (sum / N);
        long result = 0;

        while(start <= end){
            long mid = (start + end) /2;
            long current_sum = 0L;
            for(int i= 0; i < K; i++){
                current_sum += lan[i]/mid;
            }

            if(current_sum >= N){
                start = mid+1;
                result = mid;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.print(result);
    }
}