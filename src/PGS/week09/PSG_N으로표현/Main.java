package PGS.week09.PSG_N으로표현;
import java.util.*;
public class Main {

    class Solution {

        static HashSet<Integer> first, second;

        public int solution(int N, int number) {
            List<HashSet<Integer>> dp = new ArrayList<>();


            HashSet<Integer> start = new HashSet<>();
            start.add(N);
            dp.add(start);

            for(int i = 2; i <= 8; i++){
                HashSet<Integer> next = new HashSet<>();
                for(int j = 1; j < i; j++){
                    HashSet<Integer> current = new HashSet<>();
                    first = dp.get(j-1);
                    second = dp.get(i-j-1);

                    current = calculate(first, second, i, N);
                    for(int x : current){
                        next.add(x);
                    }
                }
                dp.add(next);
            }

            int min = 10;


            for(int i = 0; i < 8; i++){
                if (dp.get(i).contains(number)){
                    min = Math.min(min, i);
                }
            }
            if(min == 10){
                return -1;
            }
            else{
                return min+1;
            }
        }


        static HashSet<Integer> calculate(HashSet<Integer> first, HashSet<Integer> second, int k, int N){
            HashSet<Integer> result = new HashSet<>();
            for (int x : first) {
                for (int y : second) {
                    result.add(x+y);
                    result.add(x-y);
                    result.add(x*y);

                    if(y == 0){
                    }
                    else{
                        result.add(x/y);
                    }

                }
            }
            int NNN = N;
            for(int i = 1; i < k; i++){
                NNN = NNN * 10 + N;
            }
            result.add(NNN);
            return result;

        }

    }
}
