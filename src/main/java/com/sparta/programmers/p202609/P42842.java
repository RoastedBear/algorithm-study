package com.sparta.programmers.p202609;

import java.util.Arrays;
import java.util.Scanner;

public class P42842 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int brown = sc.nextInt();
        int yellow = sc.nextInt();
        int a = brown + yellow;
        int[] b = new int[2];
        for(int i=3; i<=a; i++){
            if(a % i == 0){
                int c = a / i;
                if(c >= i && (c - 2) * (i - 2) == yellow){
                    b[0] = c;
                    b[1] = i;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
/*
문제 설명

Leo는 카펫을 사러 갔다가
중앙에는 노란색으로 칠해져 있고
테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.

Leo는 집으로 돌아와서
아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만,
전체 카펫의 크기는 기억하지 못했습니다.

Leo가 본 카펫에서 갈색 격자의 수 brown,
노란색 격자의 수 yellow가 매개변수로 주어질 때

카펫의 가로, 세로 크기를 순서대로 배열에 담아
return 하도록 solution 함수를 작성해주세요.

제한사항

- brown은 8 이상 5,000 이하인 자연수입니다.
- yellow는 1 이상 2,000,000 이하인 자연수입니다.
- 카펫의 가로 길이는 세로 길이와 같거나 더 깁니다.

입출력 예

brown = 10
yellow = 2
return = [4, 3]

brown = 8
yellow = 1
return = [3, 3]

brown = 24
yellow = 24
return = [8, 6]

공지

- 2020년 2월 3일 테스트케이스가 추가되었습니다.
- 2020년 5월 11일 웹접근성을 고려하여 빨간색을 노란색으로 수정하였습니다.
*/