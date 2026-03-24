package BOJ.week04.BOJ_14425_문자열집합;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++){
            set.add(br.readLine());
        }

        int count = 0;

        for (int i = 0; i < M; i++){
            String line = br.readLine();
            if(set.contains(line)){
                count++;
            }
        }

        System.out.print(count);

    }
}
