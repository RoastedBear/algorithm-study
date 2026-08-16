package com.sparta.programmers.p202608;

import java.util.ArrayList;
import java.util.Arrays;

public class p181859 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0};
        ArrayList<Integer> stk = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(stk.size() == 0) {
                stk.add(arr[i]);

            } else if(stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
            } else {
                stk.add(arr[i]);
            }
        }
        if(stk.size() == 0) {
            System.out.println(Arrays.toString(new int[]{-1}));
        } else {
            int[] answer = new int[stk.size()];

            for (int i=0; i < stk.size(); i++) {
                answer[i] = stk.get(i);
            }
            System.out.println(Arrays.toString(answer));
        }
    }
}
/*
문제 설명

0과 1로만 이루어진 정수 배열 arr가 주어집니다.
arr를 이용해 새로운 배열 stk을 만드려고 합니다.

i의 초기값을 0으로 설정하고
i가 arr의 길이보다 작으면 다음을 반복합니다.

1. 만약 stk이 빈 배열이라면
   arr[i]를 stk에 추가하고 i에 1을 더합니다.

2. stk에 원소가 있고,
   stk의 마지막 원소가 arr[i]와 같으면
   stk의 마지막 원소를 제거하고 i에 1을 더합니다.

3. stk에 원소가 있는데
   stk의 마지막 원소가 arr[i]와 다르면
   stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다.

위 작업을 마친 후 만들어진 stk을 return 합니다.

단, 마지막 stk이 빈 배열이라면
[-1]을 return 합니다.


제한사항

- 1 ≤ arr의 길이 ≤ 1,000,000
- arr의 원소는 0 또는 1 입니다.


입출력 예

arr = [0, 1, 1, 1, 0]
result = [0, 1, 0]

arr = [0, 1, 0, 1, 0]
result = [0, 1, 0, 1, 0]

arr = [0, 1, 1, 0]
result = [-1]


예시 1

arr = [0, 1, 1, 1, 0]

stk = []

0 추가
stk = [0]

1은 마지막 값 0과 다름
stk = [0, 1]

1은 마지막 값 1과 같음
마지막 1 삭제
stk = [0]

1은 마지막 값 0과 다름
stk = [0, 1]

0은 마지막 값 1과 다름
stk = [0, 1, 0]

따라서
[0, 1, 0] return


예시 3

arr = [0, 1, 1, 0]

stk = []

0 추가
[0]

1 추가
[0, 1]

마지막 값 1과 현재 값 1이 같으므로 삭제
[0]

마지막 값 0과 현재 값 0이 같으므로 삭제
[]

최종 stk이 빈 배열이므로
[-1] return
*/