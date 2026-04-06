package BOJ.week06.BOJ_1697_숨바꼭질;
import java.io.*;
import java.util.*;
public class Main {

    static boolean [] visited;
    static int N,K;
    static int[] dist;


    public static void main(String [] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        visited = new boolean[100001];
        dist = new int[100001];

        BFS(N);

        System.out.print(dist[K]);

    }

    static void BFS(int n){
        Queue<Integer> q = new LinkedList<>();
        visited[n] = true;
        dist[n] = 0;
        q.add(n);
        while(!q.isEmpty()){

            int current = q.remove();

            if(current == K) return;

            int [] nexts = {current-1, current+1, current*2};

            for(int next : nexts){
                if(next < 0 || next > 100000) continue;
                if(visited[next]) continue;

                visited[next] = true;
                dist[next] = dist[current]+1;
                q.add(next);
            }
        }
    }
}
