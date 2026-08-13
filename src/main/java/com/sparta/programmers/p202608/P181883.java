package com.sparta.programmers.p202608;

import java.util.Scanner;

public class P181883 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[][] queries = new int[m][2];
        for (int i = 0; i < m; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            for (int j = a; j <= b; j++) {
                arr[j]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
문제 설명

정수 배열 arr와 2차원 정수 배열 queries가 주어집니다.
queries의 원소는 각각 하나의 query를 나타내며, [s, e] 꼴입니다.

각 query마다 순서대로
s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.

위 규칙에 따라 queries를 처리한 이후의 arr를
return 하는 solution 함수를 완성해 주세요.

제한사항

1 ≤ arr의 길이 ≤ 1,000
0 ≤ arr의 원소 ≤ 1,000,000
1 ≤ queries의 길이 ≤ 1,000
0 ≤ s ≤ e < arr의 길이

입출력 예

arr                queries                       result
[0, 1, 2, 3, 4]     [[0, 1], [1, 2], [2, 3]]      [1, 3, 4, 4, 4]

입출력 예 설명

입출력 예 #1

각 쿼리에 따라 arr가 다음과 같이 변합니다.

처음          [0, 1, 2, 3, 4]
[0, 1] 적용   [1, 2, 2, 3, 4]
[1, 2] 적용   [1, 3, 3, 3, 4]
[2, 3] 적용   [1, 3, 4, 4, 4]

따라서 [1, 3, 4, 4, 4]를 return 합니다.
*/