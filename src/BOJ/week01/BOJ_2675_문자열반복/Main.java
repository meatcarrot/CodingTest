package BOJ.week01.BOJ_2675_문자열반복;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++){

            String line = br.readLine();

            st = new StringTokenizer(line);

            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < S.length(); i++){
                for(int j=0; j < R; j++){
                    sb.append(S.charAt(i));
                }
            }

            System.out.println(sb);
        }


    }
}
