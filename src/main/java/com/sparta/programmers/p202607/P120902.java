package com.sparta.programmers.p202607;

import java.util.Scanner;

public class P120902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        String[] a = my_string.split(" ");
        int answer = Integer.parseInt(a[0]);
        for (int i = 1; i < a.length; i += 2) {
            if (a[i].equals("+")) {
                answer += Integer.parseInt(a[i + 1]);
            } else {
                answer -= Integer.parseInt(a[i + 1]);
            }
        }
        System.out.println(answer);
    }
}
/*
문제 설명

my_string은 "3 + 5"처럼 문자열로 된 수식입니다.
문자열 my_string이 매개변수로 주어질 때,
수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.

제한사항

연산자는 +, -만 존재합니다.
문자열의 시작과 끝에는 공백이 없습니다.
0으로 시작하는 숫자는 주어지지 않습니다.
잘못된 수식은 주어지지 않습니다.
5 ≤ my_string의 길이 ≤ 100
my_string을 계산한 결과값은 1 이상 100,000 이하입니다.
my_string의 중간 계산 값은 -100,000 이상 100,000 이하입니다.
계산에 사용하는 숫자는 1 이상 20,000 이하인 자연수입니다.
my_string에는 연산자가 적어도 하나 포함되어 있습니다.
return type은 정수형입니다.
my_string의 숫자와 연산자는 공백 하나로 구분되어 있습니다.

입출력 예

my_string    result
"3 + 4"      7

입출력 예 설명

입출력 예 #1

3 + 4 = 7을 return 합니다.
*/
