package com.sparta.programmers.p202608;

import java.util.Scanner;

public class P181856 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++) {
            arr2[i] = sc.nextInt();
        }
        if(arr1.length > arr2.length) {
            System.out.println(1);
        } else if(arr1.length < arr2.length) {
            System.out.println(-1);
        } else {
            int sum1 = 0;
            int sum2 = 0;
            for(int i=0; i<arr1.length; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }

            if(sum1 > sum2) {
                System.out.println(1);
            } else if(sum1 < sum2) {
                System.out.println(-1);
            } else {
                System.out.println(0);
            }
        }
    }
}
/*
문제 설명

두 정수 배열 arr1과 arr2의 대소관계를 비교합니다.

1. 두 배열의 길이가 다르면
   길이가 더 긴 배열이 더 큽니다.

2. 두 배열의 길이가 같으면
   각 배열의 모든 원소의 합을 비교합니다.

3. 합까지 같으면 두 배열은 같습니다.

arr2가 더 크면 -1
arr1이 더 크면 1
두 배열이 같으면 0을 return 합니다.

제한사항

- 1 ≤ arr1의 길이 ≤ 100
- 1 ≤ arr2의 길이 ≤ 100
- 1 ≤ arr1의 원소 ≤ 100
- 1 ≤ arr2의 원소 ≤ 100

입출력 예

arr1 = [49, 13]
arr2 = [70, 11, 2]
result = -1

arr1 = [100, 17, 84, 1]
arr2 = [55, 12, 65, 36]
result = 1

arr1 = [1, 2, 3, 4, 5]
arr2 = [3, 3, 3, 3, 3]
result = 0

예시

arr1 = [100, 17, 84, 1]
arr2 = [55, 12, 65, 36]

두 배열의 길이는 둘 다 4로 같습니다.

arr1의 합
100 + 17 + 84 + 1 = 202

arr2의 합
55 + 12 + 65 + 36 = 168

arr1의 합이 더 크므로 1을 return 합니다.
*/