package SWEA.week12.SWEA_1861_정사각형방;
import java.util.*;
import java.io.*;
public class Main {

    static int [][] map;
    static boolean [][] visited;
    static int start, count, N;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            N = Integer.parseInt(br.readLine());
            map = new int [N][N];
            visited = new boolean[N][N];

            for(int j = 0; j < N; j++){
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < N; k++){
                    map[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            start = Integer.MAX_VALUE;
            int max = 0;
            for(int x = 0; x < N; x++){
                for(int y = 0; y < N; y++){
                    visited = new boolean[N][N];
                    int len = BFS(x,y);

                    if (len > max) {
                        max = len;
                        start = map[x][y];
                    } else if (len == max && map[x][y] < start) {
                        start = map[x][y];
                    }
                }
            }
            sb.append("#").append(i+1).append(" ").append(start).append(" ").append(max).append("\n");
        }
        System.out.print(sb);
    }

    static int BFS(int x, int y){
        Deque<int []> deque = new ArrayDeque<>();
        visited[x][y] = true;
        deque.add(new int[]{x, y});
        count = 1;

        while(!deque.isEmpty()){

            int [] current = deque.remove();

            int cx = current[0];
            int cy = current[1];

            int [] dx = {-1, 1, 0, 0};
            int [] dy = {0, 0, -1, 1};

            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
                if(visited[nx][ny]) continue;

                if(map[nx][ny] == map[cx][cy] + 1){
                    count++;
                    visited[nx][ny] = true;
                    int [] next = {nx, ny};
                    deque.add(next);
                }
            }
        }
        return count;

    }

}
