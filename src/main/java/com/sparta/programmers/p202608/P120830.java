package com.sparta.programmers.p202608;

import java.util.Scanner;

public class P120830 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int service = n / 10;
        int answer = n * 12000 + k * 2000 - service * 2000;

        System.out.println(answer);
    }
}
/*
문제 설명

양꼬치 가게에서는 10인분을 먹으면
음료수 1개를 서비스로 줍니다.

양꼬치는 1인분에 12,000원
음료수는 1개에 2,000원입니다.

양꼬치 n인분과 음료수 k개를 먹었을 때
총 지불 금액을 return 합니다.

단, 양꼬치 10인분마다 음료수 1개는 무료입니다.

제한사항

- 0 < n < 1,000
- n / 10 ≤ k < 1,000
- 서비스로 받은 음료수는 모두 마십니다.

입출력 예

n = 10
k = 3
result = 124000

n = 64
k = 6
result = 768000

예시

n = 10, k = 3

양꼬치 가격
10 * 12000 = 120000

음료수 가격
3 * 2000 = 6000

양꼬치 10인분을 먹었으므로
음료수 1개 무료

1 * 2000 = 2000원 할인

120000 + 6000 - 2000 = 124000

따라서 124000을 return 합니다.
*/
