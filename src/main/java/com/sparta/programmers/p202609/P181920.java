package com.sparta.programmers.p202609;

import java.util.Arrays;
import java.util.Scanner;

public class P181920 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start_num = sc.nextInt();
        int end_num=sc.nextInt();

        int[] a=new int[end_num-start_num+1];
        int b=0;
        for(int i=start_num;i<=end_num;i++){
            a[b]=i;
            b++;
        }
        System.out.println(Arrays.toString(a));
    }
}
/*
문제 설명

정수 start_num와 end_num가 주어질 때,
start_num부터 end_num까지의 숫자를 차례로 담은 리스트를
return하도록 solution 함수를 완성해주세요.

제한사항

- 0 ≤ start_num ≤ end_num ≤ 50

입출력 예

start_num = 3
end_num = 10

result = [3, 4, 5, 6, 7, 8, 9, 10]

입출력 예 설명

3부터 10까지의 숫자들을 담은 리스트
[3, 4, 5, 6, 7, 8, 9, 10]를 return합니다.
*/