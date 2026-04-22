package PGS.week09.PSG_정수삼각형;
import java.util.*;

public class Main {

    class Solution {

        public int solution(int[][] triangle) {

            int N = triangle.length;

            int [][] map = new int [N][N];

            map[0] = triangle[0];


            for(int i = 1; i < N; i++){
                int [] line = triangle[i];
                for(int j = 0; j < line.length; j++){

                    if(j == 0){
                        map[i][j] = map[i-1][j] + triangle[i][j];
                    }

                    else if (j == line.length-1){
                        map[i][j] = map[i-1][j-1] + triangle[i][j];
                    }
                    else {
                        map[i][j] = Math.max(map[i-1][j-1], map[i-1][j] ) + triangle[i][j];
                    }
                }
            }

            int max = 0;

            for(int i = 0; i < N; i++){
                max = Math.max(map[N-1][i], max);
            }

            return max;
        }
    }
}
