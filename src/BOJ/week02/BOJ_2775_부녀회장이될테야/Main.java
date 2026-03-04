package BOJ.week02.BOJ_2775_부녀회장이될테야;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int [][] apt = new int[15][15];

        for (int j=0; j < 15; j++){
            apt[0][j] = j;
        }

        for (int h=1; h < 15; h++){
            for(int r=1; r < 15; r++){
                apt[h][r] = apt[h][r-1] + apt[h-1][r];
            }
        }

        for (int i = 0; i < T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(apt[k][n]);
        }
    }
}
