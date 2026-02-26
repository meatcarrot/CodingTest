package BOJ.week01.BOJ_11720_숫자의합;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        String word = br.readLine();

        int sum = 0;

        for (int i=0;i<n;i++){
            sum += word.charAt(i) - '0';
        }


        System.out.println(sum);

    }
}
