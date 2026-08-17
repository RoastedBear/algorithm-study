package com.sparta.programmers.p202608;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P120850 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        int count = 0;
        for(int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c >= '0' && c <= '9') {
                count++;
            }
        }
        int[] answer = new int[count];
        int index = 0;
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c >= '0' && c <= '9') {
                answer[index] = c - '0';
                index++;
            }
        }
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }
}
/*
문제 설명

문자열 my_string이 주어질 때
my_string 안에 있는 숫자만 골라서
오름차순으로 정렬한 배열을 return 합니다.

제한사항

- 1 ≤ my_string의 길이 ≤ 100
- my_string에는 숫자가 한 개 이상 포함되어 있습니다.
- my_string은 영어 소문자 또는 0부터 9까지의 숫자로 이루어져 있습니다.

입출력 예

my_string = "hi12392"
result = [1, 2, 2, 3, 9]

my_string = "p2o4i8gj2"
result = [2, 2, 4, 8]

my_string = "abcde0"
result = [0]

예시

"hi12392"에서 숫자만 찾으면

1, 2, 3, 9, 2

오름차순으로 정렬하면

1, 2, 2, 3, 9

따라서 [1, 2, 2, 3, 9]를 return 합니다.
*/