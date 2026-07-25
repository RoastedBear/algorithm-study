package com.sparta.programmers.p202607;

import java.util.Scanner;

public class P12935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (arr.length == 1) {
            System.out.println(-1);
            return;
        }
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < a) {
                a = arr[i];
            }
        }
        int[] answer = new int[arr.length - 1];
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != a) {
                answer[b] = arr[i];
                b++;
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
/*
문제 설명

정수를 저장한 배열 arr에서
가장 작은 수를 제거한 배열을 리턴하는 함수,
solution을 완성해주세요.

단, 리턴하려는 배열이 빈 배열인 경우엔
배열에 -1을 채워 리턴하세요.

예를 들어 arr이 [4, 3, 2, 1]인 경우는
가장 작은 수 1을 제거한 [4, 3, 2]를 리턴하고,

arr이 [10]이면
제거 후 빈 배열이 되므로 [-1]을 리턴합니다.

제한 조건

arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

입출력 예

arr            return
[4, 3, 2, 1]   [4, 3, 2]
[10]           [-1]
*/