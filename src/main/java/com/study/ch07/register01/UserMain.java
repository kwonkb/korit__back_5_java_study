package com.study.ch07.register01;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {


        UserService userService = new UserService();

        Scanner scanner = new Scanner(System.in);
        String userName = null;
        String userClass = null;
        String userJob = null;

        System.out.println("캐릭터 등록 프로그램");

        System.out.print("이름을 입력하세요>> ");

        userName = scanner.nextLine();
        if(userService.isEmptyString(userName)){
            System.out.println("다시 입력하세요");
            return;
        }

        System.out.print("클래스를 입력하세요>> ");

        userClass = scanner.nextLine();
        if(userService.isEmptyString(userClass)){
            System.out.println("다시 입력하세요");
            return;
        }

        System.out.print("직업을 입력하세요>>");

        userJob = scanner.nextLine();
        if(userService.isEmptyString(userJob)){
            System.out.println("다시 입력하세요");
            return;
        }

        User user = new User(userName,userClass,userJob);

        userService.registerProductService(user);


    }
}
