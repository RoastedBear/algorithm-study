package com.sparta.programmers.p202609;

import java.util.Arrays;
import java.util.Scanner;

public class P12982 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] d=new int[n];
        for(int i=0;i<n;i++){
            d[i] = sc.nextInt();
        }

        int budget=sc.nextInt();
        Arrays.sort(d);
        int a=0;
        int b = 0;
        for(int i=0; i<d.length;i++){
            if(a+d[i]<=budget){
                a += d[i];
                b++;
            } else{
                break;
            }
        }
        System.out.println(b);
    }
}
/*
문제 설명

S사에서는 각 부서에 필요한 물품을 지원해 주기 위해
부서별로 물품을 구매하는데 필요한 금액을 조사했습니다.

그러나 전체 예산이 정해져 있기 때문에
모든 부서의 물품을 구매해 줄 수는 없습니다.

그래서 최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 합니다.

물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해 줘야 합니다.

예를 들어 1,000원을 신청한 부서에는 정확히 1,000원을 지원해야 하며,
1,000원보다 적은 금액을 지원해 줄 수는 없습니다.

부서별로 신청한 금액이 들어있는 배열 d와
예산 budget이 매개변수로 주어질 때,
최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록
solution 함수를 완성해주세요.

제한사항

- d는 부서별로 신청한 금액이 들어있는 배열이며,
  길이는 1 이상 100 이하입니다.
- d의 각 원소는 1 이상 100,000 이하의 자연수입니다.
- budget은 1 이상 10,000,000 이하의 자연수입니다.

입출력 예

d = [1,3,2,5,4]
budget = 9
result = 3

d = [2,2,3,3]
budget = 10
result = 4

입출력 예 설명

입출력 예 #1

각 부서에서 [1원, 3원, 2원, 5원, 4원]만큼의 금액을 신청했습니다.

3개 부서보다 더 많은 부서의 물품을 구매해 줄 수는 없으므로
최대 3개 부서의 물품을 구매해 줄 수 있습니다.

입출력 예 #2

모든 부서의 물품을 구매해주면 10원이 됩니다.
따라서 최대 4개 부서의 물품을 구매해 줄 수 있습니다.
*/