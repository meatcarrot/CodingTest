package BOJ.week07.BOJ_2667_단지번호붙이기;

import java.io.*;
import java.util.*;

public class Main {

    static int [][] map;
    static boolean [][] visited;
    static int N;
    static ArrayList<Integer> list;
    static int count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < N; j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }

        int pack = 0;
        list = new ArrayList<>();

        for(int x = 0; x < N; x++){
            for(int y = 0; y < N; y++){
                if(map[x][y] == 1 && !visited[x][y]){
                    BFS(x,y);
                    pack++;
                    list.add(count);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(pack).append("\n");

        Collections.sort(list);

        for(int i : list){
            sb.append(i).append("\n");
        }

        System.out.print(sb);

    }

    static void BFS(int x, int y){

        Queue<int[]> q = new LinkedList<>();
        int [] now = {x,y};
        visited[x][y] = true;
        q.add(now);

        count = 1;

        while(!q.isEmpty()){
            int [] current = q.remove();
            int cx = current[0];
            int cy = current[1];

            int [] dx = {-1, 1, 0, 0};
            int [] dy = {0, 0, -1, 1};

            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || nx > N-1 || ny < 0 || ny > N-1) continue;
                if(visited[nx][ny]) continue;
                if(map[nx][ny] != 1) continue;

                int [] next = {nx, ny};
                visited[nx][ny] = true;
                q.add(next);
                count++;
            }
        }
    }
}
