package BOJ.week06.BOJ_2178_미로탐색;
import java.io.*;
import java.util.*;
public class Main {

    static int [][] map;
    static boolean [][] visited;
    static int N,M;


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int [N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < M; j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }

        BFS(0, 0);

        System.out.print(map[N-1][M-1]);

    }

    static void BFS(int n, int m){
        Queue<int[]> q = new LinkedList<>();
        int [] now = new int[2];
        now[0] = n;
        now[1] = m;
        q.add(now);
        visited[n][m] = true;

        while(!q.isEmpty()){

            int [] current = q.remove();

            int cx = current[0];
            int cy = current[1];

            int [] dx = {-1, 1, 0, 0};
            int [] dy = {0, 0, -1, 1};

            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || nx > N-1 || ny < 0 || ny > M-1) continue;
                if(visited[nx][ny]) continue;
                if(map[nx][ny] == 0) continue;


                visited[nx][ny] = true;
                map[nx][ny] = map[cx][cy] + 1;
                q.add(new int []{nx, ny});

            }

        }
    }
}
