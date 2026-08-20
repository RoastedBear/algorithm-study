package com.sparta.programmers.p202608;

import java.util.ArrayList;
import java.util.Scanner;

public class P181860 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] flag = new boolean[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            flag[i] = sc.nextBoolean();
        }
        ArrayList<Integer> x = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(flag[i]) {
                for(int j=0; j<arr[i] * 2; j++) {
                    x.add(arr[i]);
                }
            } else {
                for(int j=0; j<arr[i]; j++) {
                    x.remove(x.size() - 1);
                }
            }
        }
        for(int i=0; i<x.size(); i++) {
            System.out.print(x.get(i) + " ");
        }
    }
}
/*
문제 설명

아무 원소도 들어있지 않은 빈 배열 X가 있습니다.

길이가 같은 정수 배열 arr과 boolean 배열 flag가 주어질 때
flag를 처음부터 차례대로 확인합니다.

flag[i]가 true라면
X의 뒤에 arr[i]를 arr[i] * 2번 추가합니다.

flag[i]가 false라면
X에서 마지막 arr[i]개의 원소를 제거합니다.

모든 작업이 끝난 뒤 X를 return 합니다.

제한사항

- 1 ≤ arr의 길이 = flag의 길이 ≤ 100
- arr의 모든 원소는 1 이상 9 이하의 정수입니다.
- 현재 X의 길이보다 더 많은 원소를 빼는 입력은 주어지지 않습니다.

입출력 예

arr = [3, 2, 4, 1, 3]
flag = [true, false, true, false, false]

result = [3, 3, 3, 3, 4, 4, 4, 4]

예시

처음 X = []

flag[0] = true, arr[0] = 3
3을 6번 추가
X = [3, 3, 3, 3, 3, 3]

flag[1] = false, arr[1] = 2
마지막 2개 삭제
X = [3, 3, 3, 3]

flag[2] = true, arr[2] = 4
4를 8번 추가
X = [3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4]

flag[3] = false, arr[3] = 1
마지막 1개 삭제
X = [3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4]

flag[4] = false, arr[4] = 3
마지막 3개 삭제
X = [3, 3, 3, 3, 4, 4, 4, 4]

따라서 [3, 3, 3, 3, 4, 4, 4, 4]를 return 합니다.
*/