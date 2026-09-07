package com.sparta.programmers.p202609;

import java.util.Scanner;

public class P12945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int c = (a + b) % 1234567;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}
/*
문제 설명

피보나치 수는

F(0) = 0
F(1) = 1

이고,

F(n) = F(n - 1) + F(n - 2)

의 규칙을 가진다.

예를 들어

F(2) = 0 + 1 = 1
F(3) = 1 + 1 = 2
F(4) = 1 + 2 = 3
F(5) = 2 + 3 = 5

와 같이 이어진다.

2 이상의 n이 주어졌을 때
n번째 피보나치 수를 1234567로 나눈 나머지를 return한다.


제한사항

n은 2 이상 100,000 이하인 자연수이다.


입출력 예

n = 3
return = 2

n = 5
return = 5
*/

