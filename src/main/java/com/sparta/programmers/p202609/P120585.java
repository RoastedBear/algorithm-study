package com.sparta.programmers.p202609;

import java.util.Scanner;

public class P120585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int height = sc.nextInt();
        int a = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] > height){
                a++;
            }
        }
        System.out.println(a);
    }
}
/*
문제 설명

머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.

머쓱이네 반 친구들의 키가 담긴 정수 배열 array와
머쓱이의 키 height가 매개변수로 주어질 때,
머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.

제한사항

- 1 ≤ array의 길이 ≤ 100
- 1 ≤ height ≤ 200
- 1 ≤ array의 원소 ≤ 200

입출력 예

array = [149, 180, 192, 170]
height = 167
result = 3

array = [180, 120, 140]
height = 190
result = 0

입출력 예 설명

입출력 예 #1

149, 180, 192, 170 중 머쓱이보다 키가 큰 사람은
180, 192, 170으로 세 명입니다.

입출력 예 #2

180, 120, 140 중 190보다 큰 수는 없으므로 0명입니다.
*/