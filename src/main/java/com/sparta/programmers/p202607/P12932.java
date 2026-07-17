package com.sparta.programmers.p202607;

import java.util.Scanner;

public class P12932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String a = String.valueOf(n);
        int[] answer = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            answer[i] = a.charAt(a.length() - 1 - i) - '0';
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
/*
문제 설명

자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.

예를 들어 n이 12345이면 [5, 4, 3, 2, 1]을 리턴합니다.

제한 조건

n은 10,000,000,000 이하인 자연수입니다.

입출력 예

n        return
12345    [5, 4, 3, 2, 1]
*/