package PGS.week11.PSG_행렬테두리회전하기;

public class Main {
    class Solution {
        public int[] solution(int rows, int columns, int[][] queries) {

            int count = 0;

            int [][] map = new int [rows][columns];

            int [] result = new int [queries.length];

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    map[i][j] = ++count;
                }
            }

            int flag = 0;

            for(int [] query : queries){

                int min = Integer.MAX_VALUE;

                int r1 = query[0]-1, c1 = query[1]-1;
                int r2 = query[2]-1, c2 = query[3]-1;

                int tmp = map[r1][c1];

                for(int i = c1+1; i <= c2; i++){
                    int now = map[r1][i];
                    map[r1][i] = tmp;
                    tmp = now;
                    min = Math.min(tmp, min);
                }

                for(int i = r1+1; i <= r2; i++){
                    int now = map[i][c2];
                    map[i][c2] = tmp;
                    tmp = now;
                    min = Math.min(tmp, min);
                }

                for(int i = c2-1; i >= c1; i--){
                    int now = map[r2][i];
                    map[r2][i] = tmp;
                    tmp = now;
                    min = Math.min(tmp, min);
                }

                for(int i = r2-1; i >= r1; i--){
                    int now = map[i][c1];
                    map[i][c1] = tmp;
                    tmp = now;
                    min = Math.min(tmp, min);
                }

                result[flag] = min;
                flag++;


            }
            return result;
        }
    }
}
