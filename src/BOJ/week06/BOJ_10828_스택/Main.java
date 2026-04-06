package BOJ.week06.BOJ_10828_스택;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Stack <Integer> box = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("push")){
                int n = Integer.parseInt(st.nextToken());
                box.push(n);
            }
            else if(command.equals("pop")){
                if(box.empty()){
                    sb.append("-1").append("\n");
                }
                else {
                    int n = box.pop();
                    sb.append(n).append("\n");
                }
            }
            else if(command.equals("size")){
                sb.append(box.size()).append("\n");
            }
            else if(command.equals("empty")){
                if(box.empty()){
                    sb.append("1").append("\n");
                }
                else{
                    sb.append("0").append("\n");
                }
            }
            else if(command.equals("top")){
                if(box.empty()){
                    sb.append("-1").append("\n");
                }
                else{
                    sb.append(box.peek()).append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}