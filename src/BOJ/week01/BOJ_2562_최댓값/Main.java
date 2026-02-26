package BOJ.week01.BOJ_2562_최댓값;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            int current = Integer.parseInt(br.readLine());

            if (current > max) {
                max = current;
                index = i + 1;  // 위치 같이 갱신
            }
        }

        System.out.println(max);
        System.out.println(index);

    }
}
