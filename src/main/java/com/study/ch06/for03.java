package com.study.ch06;

import java.util.Scanner;

public class for03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("별 몇개? ");
        int starCount = scanner.nextInt();
//1.
        for (int i = 0; i < starCount; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        *
        **
        ***

        ***
        **
        *

           *
          **
         ***

         ***
          **
           *

           *
          ***
         *****

         */
//2.
        System.out.println();
        for(int i = 0; i < starCount; i++){
            for (int j = starCount; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
//3.
        for (int i = 0; i < starCount; i++) {
            for (int k = starCount - 1; k > i; k--){
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

//4.
        for(int i = 0; i < starCount; i++){
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = starCount; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        //5.
        int num = 1;

        for(int i = 0; i < starCount; i++){

            for(int k = starCount - 1; k > i; k--){
                System.out.print(" ");
            }
            for(int j = 0; j < num; j++){
                System.out.print("*");
            }
            num = num + 2;
            System.out.println();
        }

        System.out.println();
        num = starCount * 2 - 1;

        for(int i = 0; i < starCount; i++) {
            for (int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for (int j = num; j > 0; j--){
                System.out.print("*");
            }
            num = num - 2;
            System.out.println();
        }
        System.out.println();
    }
}







