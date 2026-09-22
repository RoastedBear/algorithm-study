package com.sparta.programmers.p202609;

import java.util.Arrays;
import java.util.Scanner;

public class P120854 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] strlist = new String[n];

        for(int i=0;i<n;i++){
            strlist[i]=sc.next();
        }
        int[] a=new int[n];

        for(int i=0; i<strlist.length;i++){
            a[i] = strlist[i].length();
        }
        System.out.println(Arrays.toString(a));
    }
}
/*
문제 설명

문자열 배열 strlist가 매개변수로 주어집니다.
strlist 각 원소의 길이를 담은 배열을 return하도록 solution 함수를 완성해주세요.

제한사항

- 1 ≤ strlist 원소의 길이 ≤ 100
- strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.

입출력 예

strlist = ["We", "are", "the", "world!"]
result = [2, 3, 3, 6]

strlist = ["I", "Love", "Programmers."]
result = [1, 4, 12]

입출력 예 설명

입출력 예 #1

["We", "are", "the", "world!"]의 각 원소의 길이인
[2, 3, 3, 6]을 return합니다.

입출력 예 #2

["I", "Love", "Programmers."]의 각 원소의 길이인
[1, 4, 12]을 return합니다.
*/