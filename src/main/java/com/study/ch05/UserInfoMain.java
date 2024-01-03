package com.study.ch05;

import java.util.Scanner;

public class UserInfoMain {
    public static void main(String[] args) {
        /*
        *
        * 이름: 권기범
        * 나이: 25
        * 연락처: 01033913163
        * 학년: 4
        * 주소: 부산 서구
        * */

        Scanner sc = new Scanner(System.in);

        String name = null;
        int age = 0;
        String phone = null;
        int grade = 0;
        String address = null;

        System.out.print("이름: ");
        name = sc.nextLine();

        System.out.print("나이: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("연락처: ");
        phone = sc.nextLine();

        System.out.print("학년: ");
        grade = sc.nextInt();
        sc.nextLine();

        System.out.print("주소: ");
        address = sc.nextLine();

        System.out.println("이름: " + name);

        System.out.println("나이: " + age);

        System.out.println("연락처: " + phone);

        System.out.println("학년: " + grade);

        System.out.println("주소: " + address);
    }
}
