package BOJ.week05.BOJ_1920_수찾기;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int [] nums = new int [N];
//        HashSet <Integer> numSet = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());
            nums[i] = n;
//            numSet.add(n);
        }

        Arrays.sort(nums);

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            int target = Integer.parseInt(st.nextToken());

            int start = 0;
            int end = nums.length -1;
            boolean found = false;

            while(start <= end){
                int mid = (start + end) / 2;

                if(nums[mid] == target){
                    found = true;
                    break;
                }
                else if (nums[mid] > target){
                    end = mid - 1;
                }
                else if (nums[mid] < target){
                    start = mid + 1;
                }
            }
            if (found) sb.append("1\n");
            else sb.append("0\n");
        }

        System.out.print(sb);


//        for(int i = 0; i < M; i++){
//            int n = Integer.parseInt(st.nextToken());
//            if(numSet.contains(n)){
//                sb.append("1").append("\n");
//            }
//            else{
//                sb.append("0").append("\n");
//            }
//        }
//        System.out.print(sb);


    }

}
