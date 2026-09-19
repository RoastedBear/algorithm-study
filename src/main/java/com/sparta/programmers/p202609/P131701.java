package com.sparta.programmers.p202609;

import java.util.HashSet;
import java.util.Scanner;

public class P131701 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] elements=new int[n];
        for(int i=0;i<n;i++){
            elements[i]=sc.nextInt();
        }
        HashSet<Integer> a=new HashSet<>();
        for(int i=0;i<elements.length;i++){
            int b=0;
            for(int j=0;j<elements.length;j++){
                b += elements[(i+j)%elements.length];
                a.add(b);
            }
        }
        System.out.println(a.size());
    }
}
/*
문제 설명

철호는 수열을 가지고 놀기 좋아합니다.
어느 날 철호는 어떤 자연수로 이루어진 원형 수열의 연속하는 부분 수열의 합으로
만들 수 있는 수가 모두 몇 가지인지 알아보고 싶어졌습니다.

원형 수열이란 일반적인 수열에서 처음과 끝이 연결된 형태의 수열을 말합니다.

예를 들어 수열 [7, 9, 1, 1, 4]로 원형 수열을 만들 수 있습니다.

원형 수열은 처음과 끝이 연결되어 끊기는 부분이 없기 때문에
연속하는 부분 수열도 일반적인 수열보다 많아집니다.

원형 수열의 모든 원소 elements가 순서대로 주어질 때,
원형 수열의 연속 부분 수열 합으로 만들 수 있는 수의 개수를
return 하도록 solution 함수를 완성해주세요.

제한사항

- 3 ≤ elements의 길이 ≤ 1,000
- 1 ≤ elements의 원소 ≤ 1,000

입출력 예

elements = [7, 9, 1, 1, 4]
result = 18

입출력 예 설명

길이가 1인 연속 부분 수열
[1, 4, 7, 9]

길이가 2인 연속 부분 수열
[2, 5, 10, 11, 16]

길이가 3인 연속 부분 수열
[6, 11, 12, 17, 20]

길이가 4인 연속 부분 수열
[13, 15, 18, 21]

길이가 5인 연속 부분 수열
[22]

중복되는 값을 제외하면

[1, 2, 4, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16, 17, 18, 20, 21, 22]

총 18가지입니다.
*/