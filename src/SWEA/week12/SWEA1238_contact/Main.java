package SWEA.week12.SWEA1238_contact;
import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean [] visited;
    static int [] dist;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 10; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int first = Integer.parseInt(st.nextToken());


            graph = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            dist = new int [101];
            visited = new boolean[101];

            for(int j = 0; j <= 100; j++){
                graph.add(new ArrayList<>());
            }
            for(int j = 0; j < N/2; j++){
                int start = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                graph.get(start).add(to);
            }

            BFS(first);
            int max = 0;
            int answer = 0;
            for (int x = 1; x <= 100; x++) {
                if (dist[x] > max) {
                    max = dist[x];
                    answer = x;
                } else if (dist[x] == max) {
                    answer = Math.max(answer, x);
                }
            }
            sb.append("#").append(i+1).append(" ").append(answer).append("\n");

        }
        System.out.print(sb);
    }
    static void BFS(int start){
        Deque<Integer> deque = new ArrayDeque<>();
        visited[start] = true;
        deque.add(start);
        while(!deque.isEmpty()){
            int current = deque.remove();

            for (int node : graph.get(current)) {
                if(visited[node]) continue;

                visited[node] = true;
                dist[node] = dist[current] + 1;
                deque.add(node);
            }
        }
    }
}
