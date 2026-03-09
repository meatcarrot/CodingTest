package BOJ.week03.BOJ_1085_직사각에서의탈출;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int distance_1 = Math.min(x, (w-x));
        int distance_2 = Math.min((h-y), y);

        System.out.println(Math.min(distance_1, distance_2));
    }
}
