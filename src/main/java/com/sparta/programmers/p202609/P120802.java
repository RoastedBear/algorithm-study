package com.sparta.programmers.p202609;

import java.util.Scanner;

public class P120802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a = num1 + num2;
        System.out.println(a);
    }
}
/*
문제 설명

정수 num1과 num2가 주어질 때,
num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.

제한사항

- -50,000 ≤ num1 ≤ 50,000
- -50,000 ≤ num2 ≤ 50,000

입출력 예

num1 = 2
num2 = 3
result = 5

num1 = 100
num2 = 2
result = 102

입출력 예 설명

입출력 예 #1

num1이 2이고 num2가 3이므로
2 + 3 = 5를 return합니다.

입출력 예 #2

num1이 100이고 num2가 2이므로
100 + 2 = 102를 return합니다.
*/