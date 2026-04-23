package PGS.week09.PSG_큰수만들기;
import java.util.*;
public class Main {
    class Solution {
        public String solution(String number, int k) {

            Deque<Integer> file = new ArrayDeque<>();

            int count = 0;

            for (int i = 0; i < number.length(); i++) {

                int current = number.charAt(i) - '0';

                while (count < k && !file.isEmpty() && file.peekLast() < current) {
                    file.removeLast();
                    count++;
                }

                file.addLast(current);
            }

            while(count < k){
                file.removeLast();
                count++;
            }

            StringBuilder sb = new StringBuilder();

            for(int i : file){
                sb.append(Integer.toString(i));
            }
            String result = sb.toString();

            return result;
        }
    }
}
