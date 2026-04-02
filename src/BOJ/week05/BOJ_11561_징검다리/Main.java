package BOJ.week05.BOJ_11561_징검다리;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){

            long rock = Long.parseLong(br.readLine());
            long start = 1L;
            long end = rock;
            long result = 0L;
            while(start <= end){
                long mid = (start+end)/2;

                // long sum = mid * (mid+1) /2;
                // 가우스 덧셈 공식
                // 근데 오버플로우남
                // 식 변형해서 안 나게 조

                if (mid <= (2 * rock) / (mid + 1)){
                    start = mid + 1;
                    result = mid;
                }
                else{
                    end = mid -1;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);



    }
}