package BOJ.week01.BOJ_10818_최소최대;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
//        int [] arr = new int[n];
//
        st = new StringTokenizer(br.readLine());
//
//        for (int i=0;i<n;i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int min = arr[0];
//        int max = arr[0];
//
//        for (int i = 0; i < n; i++){
//            if (arr[i] < min){
//                min = arr[i];
//            }
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.println(min + " " + max);
    }
}
