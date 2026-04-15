package PGS.week08.PSG_타겟넘버;
import java.util.*;
import java.io.*;

public class Main {
}

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;

        Map <Integer, Integer> dp = new HashMap<>();

        dp.put(0,1);

        for(int num: numbers){

            Map<Integer, Integer> next = new HashMap<>();

            for (int key : dp.keySet()) {
                next.put(key-num, next.getOrDefault(key-num, 0) + dp.get(key));
                next.put(key+num, next.getOrDefault(key+num, 0) + dp.get(key));
            }
            dp = next;

        }

        answer = dp.getOrDefault(target, 0);
        return answer;

    }
}