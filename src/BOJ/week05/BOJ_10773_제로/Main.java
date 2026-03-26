package BOJ.week05.BOJ_10773_제로;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> book = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int sum = 0;
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                book.pop();
                count--;
            }
            else{
                book.push(n);
                count++;
            }
        }
        for(int i = 0; i < count; i++){
            sum += book.pop();
        }
        System.out.print(sum);
    }
}
