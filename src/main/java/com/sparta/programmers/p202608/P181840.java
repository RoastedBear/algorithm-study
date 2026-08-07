package com.sparta.programmers.p202608;

import java.util.Scanner;

public class P181840 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num_list = new int[size];
        for (int i = 0; i < size; i++) {
            num_list[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n) {
                answer = 1;
                break;
            }
        }
        System.out.println(answer);
    }
}
/*
문제 설명

정수 리스트 num_list와 찾으려는 정수 n이 주어질 때,
num_list 안에 n이 있으면 1을,
없으면 0을 return하도록 solution 함수를 완성해주세요.

제한사항

3 ≤ num_list의 길이 ≤ 100
1 ≤ num_list의 원소 ≤ 100
1 ≤ n ≤ 100

입출력 예

num_list                  n    result
[1, 2, 3, 4, 5]           3    1
[15, 98, 23, 2, 15]       20   0

입출력 예 설명

입출력 예 #1

[1, 2, 3, 4, 5] 안에 3이 있으므로 1을 return합니다.

입출력 예 #2

[15, 98, 23, 2, 15] 안에 20이 없으므로 0을 return합니다.
*/