package BOJ.week05.BOJ_4949_균형잡힌세상;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();

        while(true){
            String line = br.readLine();
            if(line.equals(".")){
                break;
            }

            Deque<Character> box = new ArrayDeque<>();
            boolean vaild = true;
            for(int i = 0; i < line.length(); i++){
                char c = line.charAt(i);
                if (c == '(' || c == '['){
                    box.addLast(c);
                }
                else if (c == ')'){
                    if(box.isEmpty() || box.getLast() != '('){
                        vaild = false;
                        break;
                    }
                    else{
                        box.removeLast();
                    }
                }
                else if (c == ']'){
                    if(box.isEmpty() || box.getLast() != '['){
                        vaild = false;
                        break;

                    }
                    else{
                        box.removeLast();
                    }
                }
            }
            if(vaild && box.isEmpty()){
                sb.append("yes\n");
            }
            else{
                sb.append("no\n");
            }

        }
        System.out.print(sb);
    }
}
