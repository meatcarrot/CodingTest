package BOJ.week07.BOJ_1012_유기농배추;

import java.io.*;
import java.util.*;

public class Main {

    static int [][] map;
    static boolean [][] visited;
    static int count;
    static int M,N,K;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[M][N];
            visited = new boolean[M][N];


            for(int j = 0; j < K; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }
            count = 0;

            for(int k = 0; k < M; k++){
                for(int l = 0; l < N; l++){
                    if(map[k][l] == 1 && !visited[k][l]){
                        DFS(k, l);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");

        }

        System.out.print(sb);

    }

    static void DFS(int x, int y){

        visited[x][y] = true;

        int []dx = {-1, 1, 0, 0};
        int []dy = {0, 0, -1, 1};

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx > M-1 || ny < 0 || ny > N-1) continue;
            if(map[nx][ny] != 1) continue;
            if(visited[nx][ny]) continue;

            DFS(nx, ny);

        }
    }

}
