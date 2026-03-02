package BOJ.week02.BOJ_1157_단어공부;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toUpperCase();

        int [] aski = new int[26];

        java.util.Arrays.fill(aski, 0);

        for (int i = 0; i < word.length(); i++){
            aski[word.charAt(i) - 'A']++;
        }

        int max = 0;
        char answer ='?';

        for ( int i = 0; i < 26; i++){

            if (aski[i] > max) {
                max = aski[i];
                answer = (char)(i + 'A');
            } else if (aski[i] == max){
                answer = '?';
            }

        }

        System.out.println(answer);

    }
}
