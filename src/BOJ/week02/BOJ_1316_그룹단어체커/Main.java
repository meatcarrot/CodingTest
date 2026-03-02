package BOJ.week02.BOJ_1316_그룹단어체커;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int answer = count;

        for (int i=0; i< count; i++){
            int [] check = new int [26];

            java.util.Arrays.fill(check, 0);

            String word = br.readLine();

            char current = ' ';

            for (int j = 0; j < word.length(); j++){
                if (word.charAt(j) != current){
                    if (check[word.charAt(j) - 'a'] > 0){
                        answer--;
                        break;
                    }
                    else {
                        current = word.charAt(j);
                        check[word.charAt(j) - 'a']++;
                    }
                }
                else if (word.charAt(j) == current) {
                    check[word.charAt(j) - 'a']++;
                }

            }
        }
        System.out.println(answer);
    }
}
