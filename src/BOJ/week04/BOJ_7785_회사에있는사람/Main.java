package BOJ.week04.BOJ_7785_회사에있는사람;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        HashMap<String, String> ledger = new HashMap<>();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            ledger.put(st.nextToken(), st.nextToken());
        }


        ArrayList<String> names = new ArrayList<>(ledger.keySet());
        ArrayList<String> remain = new ArrayList<>();
        for(int i = 0; i < names.size(); i++){
            if(ledger.get(names.get(i)).equals("enter")){
                remain.add(names.get(i));
            };
        }
        remain.sort((a,b) ->
            b.compareTo(a)
        );

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < remain.size(); i++){
            sb.append(remain.get(i)).append("\n");
        }
        System.out.print(sb);
    }
}
