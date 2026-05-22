package SWEA.week12.SWEA_1226_미로1;

import java.io.*;
import java.util.*;

public class Main {
    static int [][] map;
    static boolean [][] visited;
    static int [] start;
    static int [] end;
    static int possible;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 10; i++){
            int N = Integer.parseInt(br.readLine());

            map = new int [16][16];
            visited = new boolean[16][16];
            start = new int [2];
            end = new int [2];
            possible = 0;
            for(int j = 0; j < 16; j++){
                String line = br.readLine();
                for(int k = 0; k < 16; k++){
                    int now = line.charAt(k) - '0';
                    if (now == 2){
                        start[0] = j;
                        start[1] = k;
                    }
                    else if (now == 3){
                        end[0] = j;
                        end[1] = k;
                    }
                    map[j][k] = now;
                }
            }

            //BFS();
            DFS(start[0], start[1]);
            sb.append("#").append(i+1).append(" ").append(possible).append("\n");

        }
        System.out.print(sb);
    }


    static void BFS (){
        Deque<int []> deque = new ArrayDeque<>();
        deque.add(start);
        visited[start[0]][start[1]] = true;
        while(!deque.isEmpty()){
            int [] current = deque.remove();
            int cx = current[0];
            int cy = current[1];

            int []dx = {-1, 1, 0, 0};
            int []dy = {0, 0, -1, 1};

            for(int i = 0; i < 4; i++){
                int nx= cx + dx[i];
                int ny= cy + dy[i];

                if(nx < 0 || nx > 15 || ny < 0 || ny > 15) continue;
                if(visited[nx][ny]) continue;
                if(map[nx][ny] == 1) continue;
                if(nx == end[0] && ny == end[1]) possible = 1;

                int [] next = {nx, ny};
                visited[nx][ny] = true;
                deque.add(next);

            }
        }
    }
    static void DFS(int x, int y){
        visited[x][y] = true;
        int []dx = {-1, 1, 0, 0};
        int []dy = {0, 0, -1, 1};

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || nx > 15 || ny < 0 || ny > 15) continue;
            if(visited[nx][ny]) continue;
            if(map[nx][ny] == 1) continue;
            if(nx == end[0] && ny == end[1]) possible = 1;
            else{
                DFS(nx,ny);
            }
        }
    }
}
