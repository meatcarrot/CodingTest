package BOJ.week06.BOJ_2164_카드2;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i < N+1; i++){
            deque.addLast(i);
        }
        while(deque.size() > 1){
            deque.removeFirst();
            deque.addLast(deque.removeFirst());
        }
        System.out.print(deque.getLast());

    }
}