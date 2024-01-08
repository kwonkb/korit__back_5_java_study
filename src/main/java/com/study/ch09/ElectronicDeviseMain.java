package com.study.ch09;

public class ElectronicDeviseMain {
    public static void main(String[] args) {
        ElectronicDevise[] electronicDevises = new ElectronicDevise[100];
        Computer[] computers = new Computer[100];

        for(int i =0; i < electronicDevises.length;  i++) {
            electronicDevises[i] =new ElectronicDevise();
        }

        ElectronicDevise electronicDevise = new ElectronicDevise();
        for(int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
        }

        ElectronicDevise electronicDevise1 = new ElectronicDevise();


        Computer computer = new Computer();



        System.out.println();


        for(int i = 0; i < electronicDevises.length; i++) {
            if(electronicDevises[i] instanceof Computer) {
                Computer computer1 = (Computer) electronicDevises[i];
                computer.playGame();
            } else if (electronicDevises[i] instanceof Smartphone){
                Smartphone smartphone = (Smartphone) electronicDevises[i];
                smartphone.call();
            }
        }
    }
}
