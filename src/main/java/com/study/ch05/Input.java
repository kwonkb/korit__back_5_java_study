package com.study.ch05;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();
        System.out.print("타이틀: ");
        scanner.nextInt();
        String title = scanner.nextLine(); //띄어쓰기는 입력의 끝으로 본다. (띄어쓰기를 포함하고 싶음)

        System.out.println(title + ": " + ( a + b + c ));





    }
}
