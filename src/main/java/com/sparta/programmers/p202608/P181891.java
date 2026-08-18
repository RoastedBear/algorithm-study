package com.sparta.programmers.p202608;

import java.util.Arrays;
import java.util.Scanner;

public class P181891 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] num_list = new int[len];

        for(int i=0; i<len; i++) {
            num_list[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] answer = new int[len];
        int index = 0;
        for(int i=n; i<num_list.length; i++) {
            answer[index] = num_list[i];
            index++;
        }
        for(int i=0; i<n; i++) {
            answer[index] = num_list[i];
            index++;
        }
        System.out.println(Arrays.toString(answer));
    }
}
/*
문제 설명

정수 리스트 num_list와 정수 n이 주어집니다.

num_list를
n번째 원소 이후의 원소들과
n번째까지의 원소들로 나눕니다.

그리고 n번째 원소 이후의 원소들을
n번째까지의 원소들 앞에 붙인 배열을 return 합니다.

제한사항

- 2 ≤ num_list의 길이 ≤ 30
- 1 ≤ num_list의 원소 ≤ 9
- 1 ≤ n ≤ num_list의 길이

입출력 예

num_list = [2, 1, 6]
n = 1
result = [1, 6, 2]

num_list = [5, 2, 1, 7, 5]
n = 3
result = [7, 5, 5, 2, 1]

예시

num_list = [2, 1, 6]
n = 1

1번째 원소 이후
[1, 6]

1번째까지의 원소
[2]

이어 붙이면

[1, 6, 2]

를 return 합니다.
*/