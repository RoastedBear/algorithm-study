package com.sparta.programmers.p202608;

import java.util.Scanner;

public class P120849 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
                answer += c;
            }
        }
        System.out.println(answer);
    }
}
/*
문제 설명

영어에서 a, e, i, o, u는 모음입니다.

문자열 my_string이 주어질 때
문자열에 포함된 모음을 모두 제거한 문자열을 return 합니다.

제한사항

- my_string은 소문자와 공백으로 이루어져 있습니다.
- 1 ≤ my_string의 길이 ≤ 1,000

입출력 예

my_string = "bus"
result = "bs"

my_string = "nice to meet you"
result = "nc t mt y"

예시

"bus"에서 모음 u를 제거하면

"bs"

를 return 합니다.

"nice to meet you"에서
i, e, o, e, e, o, u를 제거하면

"nc t mt y"

를 return 합니다.
*/