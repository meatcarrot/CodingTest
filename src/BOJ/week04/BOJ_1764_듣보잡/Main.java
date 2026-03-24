package BOJ.week04.BOJ_1764_듣보잡;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = 0;
        HashSet<String> hear = new HashSet<>();
        for(int i = 0; i < N; i++){
            hear.add(br.readLine());
        }


        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < M; i++){
            String see = br.readLine();
            if(hear.contains(see)){
                count++;
                result.add(see);
            }
        }
        result.sort((a,b) ->
                a.compareTo(b)
        );

        StringBuilder sb = new StringBuilder();
        sb.append(count).append("\n");
        for( int i = 0; i < result.size(); i++){
            sb.append(result.get(i)).append("\n");
        }

        System.out.print(sb);
    }
}
