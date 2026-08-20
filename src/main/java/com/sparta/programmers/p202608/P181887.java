package com.sparta.programmers.p202608;

import java.util.Scanner;

public class P181887 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num_list = new int[n];
        for(int i=0; i<n; i++) {
            num_list[i] = sc.nextInt();
        }
        int odd = 0;
        int even = 0;
        for(int i=0; i<num_list.length; i++) {
            if(i % 2 == 0) {
                odd += num_list[i];
            } else {
                even += num_list[i];
            }
        }
        int answer = Math.max(odd, even);
        System.out.println(answer);
    }
}
/*
문제 설명

정수 리스트 num_list가 주어집니다.

가장 첫 번째 원소를 1번 원소라고 할 때,
홀수 번째 원소들의 합과
짝수 번째 원소들의 합을 각각 구합니다.

두 합 중 더 큰 값을 return 합니다.
두 값이 같으면 그 값을 return 합니다.

제한사항

- 5 ≤ num_list의 길이 ≤ 50
- -9 ≤ num_list의 원소 ≤ 9

입출력 예

num_list = [4, 2, 6, 1, 7, 6]
result = 17

num_list = [-1, 2, 5, 6, 3]
result = 8

예시

num_list = [4, 2, 6, 1, 7, 6]

홀수 번째 원소
4 + 6 + 7 = 17

짝수 번째 원소
2 + 1 + 6 = 9

17이 더 크므로 17을 return 합니다.
*/