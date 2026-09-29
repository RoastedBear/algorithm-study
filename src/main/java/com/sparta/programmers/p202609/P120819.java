package com.sparta.programmers.p202609;

import java.util.Arrays;
import java.util.Scanner;

public class P120819 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        int[] a=new int[2];
        a[0]=money/5500;
        a[1]=money%5500;
        System.out.println(Arrays.toString(a));
    }
}
/*
문제 설명

머쓱이는 추운 날에도 아이스 아메리카노만 마십니다.
아이스 아메리카노는 한잔에 5,500원입니다.

머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와
남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

제한사항

- 0 < money ≤ 1,000,000

입출력 예

money = 5500
result = [1, 0]

money = 15000
result = [2, 4000]

입출력 예 설명

입출력 예 #1

5,500원은 아이스 아메리카노 한 잔을 살 수 있고
잔돈은 0원입니다.

입출력 예 #2

15,000원은 아이스 아메리카노 두 잔을 살 수 있고
잔돈은 4,000원입니다.
*/