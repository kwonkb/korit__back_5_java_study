package com.study.ch05;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;

        if (x < 0 && y > 0) {
            System.out.println("제1사분면");
        } else if (x > 0 && y > 0) {
            System.out.println("제2사분면");
        } else if (x < 0 && y < 0) {
            System.out.println("제3사분면");
        } else if (x > 0 && y < 0) {
            System.out.println("제4사분면");
        } else {
            System.out.println("오류");
        }
    }
}
