package com.study.ch09;

public class Smartphone extends ElectronicDevise{
    String model;
    String color;

    void call() {
        System.out.println("전화 연결을 시도합니다.");

    }

    @Override // @로 시작하면 어노테이션
    void showDeviceState() {
        super.showDeviceState();
    }
}
