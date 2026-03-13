package BOJ.week03.BOJ_10814_나이순정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        List<String[]> list = new ArrayList<>();

        for ( int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String age = st.nextToken();
            String name = st.nextToken();
            list.add(new String[]{age, name});
        }

        list.sort((a,b) -> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));

        StringBuilder sb = new StringBuilder();

//        for (int i = 0; i < list.size(); i++){
//            String[] p = list.get(i);
//            sb.append(p[0]).append(" ").append(p[1]).append(" ");
//        }

        for ( String [] p : list) {
            sb.append(p[0]).append(" ").append(p[1]).append("\n");
        }

        System.out.print(sb);



    }
}
