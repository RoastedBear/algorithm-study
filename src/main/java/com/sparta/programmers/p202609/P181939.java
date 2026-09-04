package com.sparta.programmers.p202609;

import java.util.Scanner;

public class P181939 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Integer.parseInt("" + a + b);
        int d = Integer.parseInt("" + b + a);
        if(c >= d){
            System.out.println(c);
        }else{
            System.out.println(d);
        }
    }
}
/*
문제 설명

연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다.
예를 들면 다음과 같습니다.

12 ⊕ 3 = 123
3 ⊕ 12 = 312

양의 정수 a와 b가 주어졌을 때,
a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.

단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.

제한사항

- 1 ≤ a, b < 10,000

입출력 예

a = 9
b = 91
result = 991

a = 89
b = 8
result = 898

입출력 예 설명

입출력 예 #1

a ⊕ b = 991 이고,
b ⊕ a = 919 입니다.
둘 중 더 큰 값은 991 이므로 991을 return 합니다.

입출력 예 #2

a ⊕ b = 898 이고,
b ⊕ a = 889 입니다.
둘 중 더 큰 값은 898 이므로 898을 return 합니다.
*/