package com.study.ch07;

public class UserMain01 {
    public static void main(String[] args) {
        User01 user1 = new User01("rlqja98","19980331");
        User01 user2 = new User01("rlqja","19980331","권","hunter8151@gmail.com");

        user1.showInfo();
        System.out.println("------------------------------");

        user2.showInfo();
        System.out.println("------------------------------");

        user1.setName("권기범");
        user1.setEmail("kwonkb98@gmail.com");

        user1.showInfo();


    }
}
