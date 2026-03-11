package BOJ.week03.BOJ_2309_일곱난쟁이;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] nanjang = new int [9];
        int sum = 0;

        for ( int i = 0; i < 9; i++){
            int x = Integer.parseInt(br.readLine());
            sum += x;
            nanjang[i] = x;
        }

        int a=0,b=0;
        for(int i=0;i<8;i++){
            for(int j=i+1;j<9;j++){
                if(sum - nanjang[i] - nanjang[j] == 100){
                    a=i;
                    b=j;
                }
            }
        }

        int[] real = new int[7];
        int idx = 0;

        for(int i=0;i<9;i++){
            if(i!=a && i!=b){
                real[idx++] = nanjang[i];
            }
        }

        Arrays.sort(real);

        for(int x : real){
            System.out.println(x);
        }

    }

}
