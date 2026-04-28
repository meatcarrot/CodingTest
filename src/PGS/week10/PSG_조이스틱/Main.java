package PGS.week10.PSG_조이스틱;

public class Main {
    class Solution {
        public int solution(String name) {


            int move = name.length() - 1;

            for (int i = 0; i < name.length(); i++) {

                int next = i + 1;
                while (next < name.length() && name.charAt(next) == 'A') {
                    next++;
                }

                move = Math.min(move, Math.min(
                        i + i + (name.length() - next),
                        (name.length() - next) * 2 + i
                ));
            }

            int sum = 0;

            for(int i = 0; i < name.length(); i++){


                int current = (int)name.charAt(i) - 65;

                if(current > 13){
                    sum += 26 - current;
                }
                else if(current <= 13 && current > 0){
                    sum += current;
                }

            }

            int result = sum + move;

            return result;
        }
    }

}
