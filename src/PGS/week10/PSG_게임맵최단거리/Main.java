package PGS.week10.PSG_게임맵최단거리;
import java.util.*;

public class Main {

    class Solution {

        static boolean [][] visited;
        static int [][] map;

        public int solution(int[][] maps) {

            map = maps;
            int x = maps.length;
            int y = maps[0].length;
            visited = new boolean[x][y];

            BFS();

            if(visited[x-1][y-1]){
                return map[x-1][y-1];
            }
            else{
                return -1;
            }

        }

        static void BFS(){
            Queue<int[]> q = new LinkedList<>();
            visited[0][0] = true;
            int [] start = {0,0};
            q.add(start);

            while(!q.isEmpty()){
                int [] current = q.remove();
                int cx = current[0];
                int cy = current[1];

                int [] dx = {-1, 1, 0, 0};
                int [] dy = {0, 0, -1, 1};

                for(int i = 0; i < 4; i++){
                    int nx = cx + dx[i];
                    int ny = cy + dy[i];

                    if (nx < 0 || nx >= map.length || ny < 0 || ny >= map[0].length){
                        continue;
                    }
                    else if(!visited[nx][ny] && map[nx][ny] > 0){
                        int [] next = {nx, ny};
                        visited[nx][ny] = true;
                        q.add(next);
                        map[nx][ny] += map[cx][cy];
                    }
                }
            }
        }
    }
}
