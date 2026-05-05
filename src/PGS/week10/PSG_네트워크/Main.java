package PGS.week10.PSG_네트워크;
import java.util.*;
public class Main {
    class Solution {

        static boolean [] visited;
        static int [][] map;
        static int nums;
        public int solution(int n, int[][] computers) {
            map = computers;
            nums = n;
            visited = new boolean[n];
            int count = 0;

            for(int i = 0; i < n; i++){
                if(!visited[i]){
                    DFS(i);
                    count++;
                }

            }
            return count;


        }

        static void DFS(int x){
            visited[x] = true;

            for(int i = 0; i < nums ; i++){
                if(map[x][i] == 1 && !visited[i]){
                    DFS(i);
                }
            }

        }
    }
}
