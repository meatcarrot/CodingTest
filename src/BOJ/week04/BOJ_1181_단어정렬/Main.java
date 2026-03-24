package BOJ.week04.BOJ_1181_단어정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> word = new ArrayList<>(set);

        word.sort((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.size(); i++) {
            sb.append(word.get(i)).append("\n");
        }

        System.out.print(sb);
    }
}
