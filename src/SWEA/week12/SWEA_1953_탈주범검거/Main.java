package SWEA.week12.SWEA_1953_탈주범검거;
import java.io.*;
import java.util.*;
public class Main {


    static boolean[][] visited;
    static int N,M,R,C,L,count;
    static int [][] map;
    static int [] dx = {-1, 1, 0, 0};
    static int [] dy = {0, 0, -1, 1};
    static int [] opposite = {1, 0, 3, 2};
    static int[][] haveDir = {
            {},          // 0
            {0,1,2,3},   // 1: 상하좌우
            {0,1},       // 2: 상하
            {2,3},       // 3: 좌우
            {0,3},       // 4: 상우
            {1,3},       // 5: 하우
            {1,2},       // 6: 하좌
            {0,2}        // 7: 상좌
    };

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());

        for(int i = 0; i < test; i++){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());

            map = new int [N][M];
            visited = new boolean[N][M];

            for(int j = 0; j < N; j++){
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < M; k++){

                    map[j][k] = Integer.parseInt(st.nextToken());


                }
            }

            BFS();
            sb.append("#").append(i + 1).append(" ").append(count).append("\n");

        }
        System.out.print(sb);
    }

    static boolean canGo(int type, int d){
        for(int dir : haveDir[type]){
            if(dir == d) return true;
        }
        return false;
    }

    static void BFS(){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{R, C ,1});
        visited[R][C] = true;
        count = 1;

        while(!q.isEmpty()){
            int [] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int time = cur[2];

            if (time == L) continue;

            int type = map[x][y];

            for (int d = 0; d < 4; d++) {
                if (!canGo(type, d)) continue;

                int nx = x + dx[d];
                int ny = y + dy[d];

                if(nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (map[nx][ny] == 0) continue;
                if (visited[nx][ny]) continue;

                int nextType = map[nx][ny];

                if(!canGo(nextType, opposite[d])) continue;

                visited[nx][ny] = true;
                count++;
                q.add(new int[]{nx, ny, time + 1});
            }
        }

    }

}
