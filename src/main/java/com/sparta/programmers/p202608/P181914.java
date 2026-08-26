package com.sparta.programmers.p202608;

import java.util.Scanner;

public class P181914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int sum = 0;
        for(int i=0; i<number.length(); i++){
            sum += number.charAt(i) - '0';
        }
        System.out.println(sum % 9);
    }
}
/*
문제 설명

음이 아닌 정수를 9로 나눈 나머지는
그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같습니다.

문자열 number가 주어질 때
각 자리 숫자의 합을 구하고
그 합을 9로 나눈 나머지를 return 합니다.

제한사항

- 1 ≤ number의 길이 ≤ 100,000
- number는 숫자로만 이루어져 있습니다.
- number가 0이 아니라면 0으로 시작하지 않습니다.

입출력 예

number = "123"
result = 6

number = "78720646226947352489"
result = 2

예시

"123"의 각 자리 숫자의 합은

1 + 2 + 3 = 6

6 % 9 = 6

따라서 6을 return 합니다.
*/