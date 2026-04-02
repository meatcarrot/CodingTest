package BOJ.week05.BOJ_2110_공유기설치;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int [] home = new int [N];

        for(int i = 0; i < N; i++){
            home[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(home);

        int result=0;
        int start = 1;
        int end = home[N-1] - home[0];

        while(start<=end){
            int mid = (start + end)/2;
            int count = 1;
            int last = home[0];

            for(int i = 1; i < N; i++){
                if(home[i] - last >= mid){
                    count++;
                    last = home[i];
                }
                else{
                    continue;
                }
            }
            if(count >= C){
                result = mid;
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        System.out.print(result);

    }
}