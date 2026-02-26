package BOJ.week01.BOJ_10809_알파벳찾기;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int size = word.length();

        int [] abc = new int[26];

        java.util.Arrays.fill(abc, -1);

        for (int i = size-1; i > -1; i--){

            abc[(word.charAt(i) - 'a')] = i;

        }

        for (int i = 0; i < 26; i++){
            System.out.print(abc[i]+" ");
        }

    }
}
