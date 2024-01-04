package com.study.ch07.register01;

public class UserDB {
    void insertUserInfo(User user) {
        System.out.println("DB에 Insert 완료");
        System.out.println("Insert 내용");
        System.out.println("캐릭터 이름: " + user.name);
        System.out.println("캐릭터 클래스: " + user.charactorClass);
        System.out.println("캐릭터 직업: " + user.Job);
        System.out.println();
    }

}
