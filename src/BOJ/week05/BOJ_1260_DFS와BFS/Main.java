package BOJ.week05.BOJ_1260_DFS와BFS;
import java.util.*;
import java.io.*;

public class Main {

    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph;
    static StringBuilder sb = new StringBuilder();

    public static void main(String [] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        Arrays.fill(visited, false);

        graph = new ArrayList<>();

        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i = 1; i < N+1; i++){
            Collections.sort(graph.get(i));
        }

        DFS(V);
        sb.append("\n");

        visited = new boolean[N + 1];
        BFS(V);

        System.out.print(sb);
    }

    static void DFS(int n){
        visited[n] = true;
        sb.append(n).append(" ");
        for(int next : graph.get(n)){
            if(!visited[next]){
                DFS(next);
            }
        }

    }

    static void BFS(int n){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        visited[n] = true;

        while(!queue.isEmpty()) {
            int now = queue.remove();
            sb.append(now).append(" ");

            for(int next : graph.get(now)){
                if(!visited[next]){
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }

}
