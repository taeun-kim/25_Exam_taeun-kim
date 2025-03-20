package org.example;
//1. 가로길이, 세로길이를 입력받아 사각형 넓이 만큼 별을 찍어내는 프로그램을 구현합니다(30점)
//- for문 혹은 while문 둘다 사용가능
//Scanner 활용

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("가로 길이: ");
        int a = scanner.nextInt();
        System.out.print("세로 길이: ");
        int b = scanner.nextInt();

        for (int j = 0; j < b; j++) {
        for (int i = 0; i < a; i++) {
            System.out.print("*");
            }
            System.out.println();
        }
    }
}