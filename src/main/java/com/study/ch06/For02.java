package com.study.ch06;

public class For02 {
    public static void main(String[] args) {
        /*
        0, 1, 2, 3, 4
         */

        for(int i =0; i < 5; i++) {
            if(i < 4) {
                System.out.print(i);
                System.out.print(", ");
            } else {
                System.out.println(i);
                System.out.println();
            }
        }
        for (int i = 0; i < 10; i++){
            if (i <= 3) {
                System.out.print(i);
                System.out.print(", ");
            } else if (i == 4) {
                System.out.println(i);
            } else if (i >= 5 && i < 9) {
                System.out.print(i);
                System.out.print(", ");
            } else {
                System.out.println(i);
            }
        }
        int n = 5;
        for(int i = 0; i < n; i++){
            int rv_i = n - 1 - i;
            System.out.print(rv_i);
            if(rv_i % 5 != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }




    }
}
