package com.sparta.programmers.p202611;

import java.util.Scanner;

public class P181941 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        String answer="";
        for(int i=0; i<arr.length;i++){
            answer+=arr[i];
        }
        System.out.println(answer);
    }
}
/*
문제 설명

문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

제한사항

- 1 ≤ arr의 길이 ≤ 200
  - arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.

입출력 예

arr           | result
["a","b","c"] | "abc"
*/