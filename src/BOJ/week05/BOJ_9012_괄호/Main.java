package BOJ.week05.BOJ_9012_괄호;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            Stack <Character> memory = new Stack<>();
            boolean vaild = true;
            for(int j = 0; j < line.length(); j++){
                char c = line.charAt(j);
                if(c == '('){
                    memory.push('(');
                }
                else if(memory.empty() && c == ')'){
                    vaild = false;
                    break;
                }
                else{
                    memory.pop();
                }
            }
            if(memory.empty() && vaild){
                sb.append("YES").append("\n");
            }
            else{
                sb.append("NO").append("\n");
            }
        }
        System.out.print(sb);


    }
}