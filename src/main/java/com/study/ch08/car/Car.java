package com.study.ch08.car;

public class Car {
    String model;
    String color;


    Car () {

    }



    Car (String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car(model = " + model + ", color= " + color + ")";
    }
}
