package com.sparta.programmers.p202607;

public class P82612 {
    class Solution {
        public long solution(int price, int money, int count) {
            long total = 0;

            for (int i = 1; i <= count; i++) {
                total += (long) price * i;
            }

            if (total <= money) {
                return 0;
            }

            return total - money;
        }
    }
}
