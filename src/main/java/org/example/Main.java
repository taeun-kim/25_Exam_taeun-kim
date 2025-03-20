package org.example;
//양의 정수 n을 요청받아 숫자 패턴의 피라미드를 출력하는 프로그램을 구현합니다.
//피라미드는 n 레벨을 가져야 하며, 최상위 레벨에서 n부터 시작하여
//맨 아래층에서 1까지 숫자가 감소해야 합니다. (30점)
//for문 혹은 while문 둘다 사용가능
// Scanner 활용

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" n을 입력 : ");
        int n = scanner.nextInt();


        for (int i = 0; i < n; i++) {

            int num = n - i;

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print(num - j + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
