package com.sparta.programmers.p202607;

import java.util.Scanner;

public class P181836 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] picture = new String[n];
        for (int i = 0; i < n; i++) {
            picture[i] = sc.next();
        }
        String[] answer = new String[n * k];
        int a = 0;
        for (int i = 0; i < picture.length; i++) {
            String b = "";
            for (int j = 0; j < picture[i].length(); j++) {
                for (int l = 0; l < k; l++) {
                    b += picture[i].charAt(j);
                }
            }
            for (int j = 0; j < k; j++) {
                answer[a] = b;
                a++;
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
/*
문제 설명

직사각형 형태의 그림 파일이 있고,
이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다.

이 그림 파일을 나타낸 문자열 배열 picture와
정수 k가 매개변수로 주어질 때,
이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록
문자열 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항

1 ≤ picture의 길이 ≤ 20
1 ≤ picture의 원소의 길이 ≤ 20
모든 picture의 원소의 길이는 같습니다.
picture의 원소는 '.'과 'x'로 이루어져 있습니다.
1 ≤ k ≤ 10

입출력 예

picture                                                  k    result
[".xx...xx.", "x..x.x..x", ...]                          2    가로 세로 2배 확대된 배열
["x.x", ".x.", "x.x"]                                   3    가로 세로 3배 확대된 배열

입출력 예 설명

입출력 예 #1

예제 1번의 picture를 가로 세로로 2배 확대하면
각 문자는 가로로 2번씩 반복되고,
각 줄은 세로로 2번씩 반복됩니다.

입출력 예 #2

예제 2번의 picture는 다음과 같습니다.

x.x
.x.
x.x

이를 가로 세로로 3배 확대하면 다음과 같습니다.

xxx...xxx
xxx...xxx
xxx...xxx
...xxx...
...xxx...
...xxx...
xxx...xxx
xxx...xxx
xxx...xxx
*/