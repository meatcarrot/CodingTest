package BOJ.week02.BOJ_1152_단어의갯수;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        String line = br.readLine();

        st = new StringTokenizer(line);

        System.out.println(st.countTokens());

    }
}
