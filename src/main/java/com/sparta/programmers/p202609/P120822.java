package com.sparta.programmers.p202609;

import java.util.Scanner;

public class P120822 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String my_string=sc.nextLine();
        String a="";

        for(int i=my_string.length()-1;i>=0;i--){
            a+=my_string.charAt(i);
        }
        System.out.println(a);
    }
}
/*
문제 설명

문자열 my_string이 매개변수로 주어집니다.
my_string을 거꾸로 뒤집은 문자열을
return하도록 solution 함수를 완성해주세요.

제한사항

- 1 ≤ my_string의 길이 ≤ 1,000

입출력 예

my_string = "jaron"
return = "noraj"

my_string = "bread"
return = "daerb"

입출력 예 설명

입출력 예 #1

my_string이 "jaron"이므로
거꾸로 뒤집은 "noraj"를 return합니다.

입출력 예 #2

my_string이 "bread"이므로
거꾸로 뒤집은 "daerb"를 return합니다.
*/