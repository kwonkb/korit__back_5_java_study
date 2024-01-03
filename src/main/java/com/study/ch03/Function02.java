package com.study.ch03;

public class Function02 {

    // 매개변수x, 리턴x
    public static void fx01() {
        //void -> 비어있는, 공허한 -> 리턴값x
        System.out.println("fx01 함수 실행");
        System.out.println();
    }
    //오버로딩: 매개변수의 자료형을 달리함으로서 이름이 같은 새로운 함수를 정의
    public static void fx02(int age, String name) {
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println();
    }

    public static void fx02(String b, int a) {
        System.out.println("fx02 함수 실행");
        System.out.println("이름: " + b);
        System.out.println("나이: " + a);
        System.out.println();
    }

    public static int fx03() {
        System.out.println("fx03 함수 실행");
        return 100;
    }
//
//    public static String fx03() {
//        System.out.println("fx03 함수 실행");
//        return "100";
//    }

    public static String fx04(String name, int age) {
        return name + " , " + age;

    }

    public static void main(String[] args) {
        fx01();
        fx02(25,"권기범");
        fx02("권기범",25);
        int num = fx03();
        System.out.println(fx03());
        String result = fx04("권기범", 25);
        System.out.println(result);
    }
}
