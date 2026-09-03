package com.sparta.programmers.p202609;

import java.util.Scanner;

public class P120829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle = sc.nextInt();
        int a;
        if(angle < 90){
            a = 1;
        }else if(angle == 90){
            a = 2;
        }else if(angle < 180){
            a = 3;
        }else{
            a = 4;
        }
        System.out.println(a);
    }
}
/*
문제 설명

각에서 0도 초과 90도 미만은 예각,
90도는 직각,
90도 초과 180도 미만은 둔각,
180도는 평각으로 분류합니다.

각 angle이 매개변수로 주어질 때
예각일 때 1,
직각일 때 2,
둔각일 때 3,
평각일 때 4를 return하도록 solution 함수를 완성해주세요.

예각 : 0 < angle < 90
직각 : angle = 90
둔각 : 90 < angle < 180
평각 : angle = 180

제한사항

- 0 < angle ≤ 180
- angle은 정수입니다.

입출력 예

angle = 70
result = 1

angle = 91
result = 3

angle = 180
result = 4

입출력 예 설명

입출력 예 #1

angle이 70이므로 예각입니다.
따라서 1을 return합니다.

입출력 예 #2

angle이 91이므로 둔각입니다.
따라서 3을 return합니다.

입출력 예 #3

angle이 180이므로 평각입니다.
따라서 4를 return합니다.
*/