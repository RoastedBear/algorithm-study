package com.sparta.programmers.p202609;

import java.util.Arrays;
import java.util.Scanner;

public class P120833 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] a = new int[num2 - num1 + 1];
        int b = 0;
        for(int i=num1; i<=num2; i++){
            a[b] = numbers[i];
            b++;
        }
        System.out.println(Arrays.toString(a));
    }
}
/*
문제 설명

정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을
return 하도록 solution 함수를 완성해보세요.

제한사항

- 2 ≤ numbers의 길이 ≤ 30
- 0 ≤ numbers의 원소 ≤ 1,000
- 0 ≤ num1 < num2 < numbers의 길이

입출력 예

numbers = [1, 2, 3, 4, 5]
num1 = 1
num2 = 3
result = [2, 3, 4]

numbers = [1, 3, 5]
num1 = 1
num2 = 2
result = [3, 5]

입출력 예 설명

입출력 예 #1

[1, 2, 3, 4, 5]의 1번째 인덱스 2부터
3번째 인덱스 4까지 자른 [2, 3, 4]를 return 합니다.

입출력 예 #2

[1, 3, 5]의 1번째 인덱스 3부터
2번째 인덱스 5까지 자른 [3, 5]를 return 합니다.
*/