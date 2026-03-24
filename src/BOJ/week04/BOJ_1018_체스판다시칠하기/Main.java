package BOJ.week04.BOJ_1018_체스판다시칠하기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char [][] board = new char [N][M];


        for ( int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for ( int j = 0; j < M; j++){
                board[i][j] = line.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= N-8; i++){
            for (int j = 0; j <= M-8; j++){

                int whiteStart = 0;
                int blackStart = 0;

                for (int r = i; r < i+8; r++){
                    for (int c = j; c < j+8; c++){
                        if ((r+c) % 2 == 0){
                            if(board[r][c] != 'W') whiteStart++;
                            if(board[r][c] != 'B') blackStart++;
                        }
                        else {
                            if(board[r][c] != 'B') whiteStart++;
                            if(board[r][c] != 'W') blackStart++;
                        }
                    }
                }

                int current = Math.min(whiteStart, blackStart);
                min = Math.min(min, current);
            }
        }

        System.out.print(min);


    }
}
