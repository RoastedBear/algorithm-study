package com.sparta.programmers.p202608;

import java.util.ArrayList;
import java.util.Arrays;

public class p181859 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        ArrayList<Integer> x = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    x.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    x.remove(x.size() - 1);
                }
            }
        }
        int[] answer = new int[x.size()];
        for (int i = 0;i<x.size(); i++) {
            answer[i] = x.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
/*
문제 설명

아무 원소도 들어있지 않은 빈 배열 X가 있습니다.

길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때,
flag를 차례대로 순회하며

flag[i]가 true라면
X의 뒤에 arr[i]를 arr[i] × 2번 추가하고,

flag[i]가 false라면
X에서 마지막 arr[i]개의 원소를 제거한 뒤

X를 return 하는 solution 함수를 작성해 주세요.


제한사항

- 1 ≤ arr의 길이 = flag의 길이 ≤ 100
- arr의 모든 원소는 1 이상 9 이하의 정수입니다.
- 현재 X의 길이보다 더 많은 원소를 빼는 입력은 주어지지 않습니다.


입출력 예

arr
[3, 2, 4, 1, 3]

flag
[true, false, true, false, false]

result
[3, 3, 3, 3, 4, 4, 4, 4]


입출력 예 설명

처음 X = []

i = 0
flag[0] = true
arr[0] = 3

3을 3 × 2 = 6번 추가

X = [3, 3, 3, 3, 3, 3]


i = 1
flag[1] = false
arr[1] = 2

마지막 원소 2개 제거

X = [3, 3, 3, 3]


i = 2
flag[2] = true
arr[2] = 4

4를 4 × 2 = 8번 추가

X = [3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4]


i = 3
flag[3] = false
arr[3] = 1

마지막 원소 1개 제거

X = [3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4]


i = 4
flag[4] = false
arr[4] = 3

마지막 원소 3개 제거

X = [3, 3, 3, 3, 4, 4, 4, 4]


따라서

[3, 3, 3, 3, 4, 4, 4, 4]

를 return 합니다.
*/