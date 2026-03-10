package BOJ.week03.BOJ_2231_분해합;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for( int i = 0; i <= N; i++){
            int temp = i;
            int sum = i; // 자기 자신부터 시작

            while (temp != 0) {
                sum += temp % 10; // 1의 자릿수를 떼서 더함
                temp /= 10;       // 1의 자릿수를 버림
            }
            if(sum == N){
                System.out.println(i);
                return;
            }
        }
    }
}
