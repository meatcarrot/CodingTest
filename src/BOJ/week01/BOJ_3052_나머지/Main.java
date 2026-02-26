package BOJ.week01.BOJ_3052_나머지;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) throws Exception{
//        HashSet<Integer> a = new HashSet<>();
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = 10;
//        int num = 0;
//
//        for (int i = 0;i<n;i++){
//            num = Integer.parseInt(br.readLine());
//            a.add(num%42);
//        }
//
//        System.out.println(a.size());

        boolean[] visited = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int num = 0;

        for (int i=0; i < 10; i++){
            num = Integer.parseInt(br.readLine());
            int remainder = num % 42;
            visited[remainder] = true;
        }

        int count = 0;
        for (int i=0;i<42;i++){
            if(visited[i] == true) count ++;
        }

        System.out.println(count);


    }

}
