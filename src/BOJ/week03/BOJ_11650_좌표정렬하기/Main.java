package BOJ.week03.BOJ_11650_좌표정렬하기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int [][] nums = new int [N][2];

        for ( int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            nums[i][0] = Integer.parseInt(st.nextToken());
            nums[i][1] = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(nums, (a,b) ->{
            if(a[0]==b[0]) return a[1]-b[1];
            return a[0]-b[0];
                });

        StringBuilder sb = new StringBuilder();

        for ( int i = 0; i < N; i++){
            sb.append(nums[i][0]).append(" ").append(nums[i][1]).append("\n");
        }
        System.out.println(sb);

    }
}
