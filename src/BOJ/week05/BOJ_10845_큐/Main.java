package BOJ.week05.BOJ_10845_큐;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("push")){
                int n = Integer.parseInt(st.nextToken());
                queue.addLast(n);
            }
            else if(command.equals("pop")){
                if(queue.isEmpty()){
                    sb.append("-1").append("\n");
                }
                else {
                    int n = queue.removeFirst();
                    sb.append(n).append("\n");
                }
            }
            else if(command.equals("size")){
                sb.append(queue.size()).append("\n");
            }
            else if(command.equals("empty")){
                if(queue.isEmpty()){
                    sb.append("1").append("\n");
                }
                else{
                    sb.append("0").append("\n");
                }
            }
            else if(command.equals("front")){
                if(queue.isEmpty()){
                    sb.append("-1").append("\n");
                }
                else{
                    sb.append(queue.getFirst()).append("\n");
                }
            }
            else if(command.equals("back")){
                if(queue.isEmpty()){
                    sb.append("-1").append("\n");
                }
                else{
                    sb.append(queue.getLast()).append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}
