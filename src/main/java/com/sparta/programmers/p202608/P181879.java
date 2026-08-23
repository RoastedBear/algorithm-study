package com.sparta.programmers.p202608;

import java.util.Scanner;

public class P181879 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num_list = new int[n];

        for(int i=0; i<n; i++) {
            num_list[i] = sc.nextInt();
        }
        int answer;
        if(num_list.length >= 11) {
            int sum = 0;
            for(int i=0; i<num_list.length; i++) {
                sum += num_list[i];
            }
            answer = sum;
        } else {
            int mul = 1;
            for(int i=0; i<num_list.length; i++) {
                mul *= num_list[i];
            }
            answer = mul;
        }
        System.out.println(answer);
    }
}
/*
문제 설명

정수가 담긴 리스트 num_list가 주어집니다.

num_list의 길이가 11 이상이면
리스트의 모든 원소의 합을 return 합니다.

num_list의 길이가 10 이하이면
리스트의 모든 원소의 곱을 return 합니다.

제한사항

- 2 ≤ num_list의 길이 ≤ 20
- 1 ≤ num_list의 원소 ≤ 9
- 모든 원소를 곱한 값은 int 범위를 넘지 않습니다.

입출력 예

num_list = [3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1]
result = 51

num_list = [2, 3, 4, 5]
result = 120

예시

num_list의 길이가 13이면
모든 원소를 더해서 51을 return 합니다.

num_list의 길이가 4이면
2 * 3 * 4 * 5 = 120

따라서 120을 return 합니다.
*/