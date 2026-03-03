package BOJ.week02.BOJ_1193_분수찾기;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int line = 1;
        int sum = 1;

        while (sum < N){
            line++;
            sum += line;
        }

        int index = sum - N;

        int head;
        int bottom;

        if (line % 2 == 0) {
            head = line - index;
            bottom = 1 + index;
            System.out.printf("%d/%d",head,bottom);
        }
        else {
            head = 1 + index;
            bottom = line - index;
            System.out.printf("%d/%d",head,bottom);
        }
    }
}
