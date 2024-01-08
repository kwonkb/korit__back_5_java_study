package com.study.ch09;

public class Computer extends ElectronicDevise {
    String cpu;
    int ram;

    void playGame() {
        System.out.println("PC 게임을 합니다.");
    }

    @Override
    void showDeviceState() {
        System.out.println("컴퓨터");
        super.showDeviceState();
    }
}
