package com.sparta.programmers.p202608;

import java.util.ArrayList;
import java.util.Scanner;

public class P181870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strArr = new String[n];
        for(int i=0; i<n; i++) {
            strArr[i] = sc.nextLine();
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                list.add(strArr[i]);
            }
        }

        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
/*
문제 설명

문자열 배열 strArr가 주어집니다.

배열 안의 문자열 중에서
"ad"라는 부분 문자열을 포함하고 있는 문자열은 제거하고,
나머지 문자열만 기존 순서를 유지해서 배열로 return 합니다.

제한사항

- 1 ≤ strArr의 길이 ≤ 1,000
- 1 ≤ strArr의 원소 길이 ≤ 20
- strArr의 원소는 알파벳 소문자로 이루어져 있습니다.

입출력 예

strArr = ["and","notad","abcd"]
result = ["and","abcd"]

strArr = ["there","are","no","a","ds"]
result = ["there","are","no","a","ds"]

예시

"and" -> "ad"를 포함하지 않음 -> 유지
"notad" -> "ad"를 포함함 -> 제거
"abcd" -> "ad"를 포함하지 않음 -> 유지

따라서

["and","abcd"]

를 return 합니다.
*/