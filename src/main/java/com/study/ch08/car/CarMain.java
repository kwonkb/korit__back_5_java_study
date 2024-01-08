package com.study.ch08.car;

import java.util.Scanner;

public class CarMain {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String selectedMenu = null;
    boolean loopfrag = true;

    Car[] cars = new Car[3];
    CarRepository carRepository = new CarRepository(cars);
    CarService carService = new CarService(carRepository);





    while (loopfrag) {
        System.out.println("자동차 관리 프로그램");
        System.out.println("1. 자동차 관리");
        System.out.println("2. 자동차 조회");
        System.out.println("q. 프로그램 종료");
        System.out.print("메뉴 선택 >>>");
        selectedMenu = scanner.nextLine();
        if ("q".equalsIgnoreCase(selectedMenu)) {
            System.out.println("프로그램을 종료중...");
            loopfrag = false;


        } else if ("1".equals(selectedMenu)) {
            System.out.println("자동차 등록 페이지 >>>");
            String model = null;
            String color = null;

            if (carService.isFull()) {
                    System.out.println("더이상 등록할 수 없습니다");
                    continue;
            }

            System.out.println("모델명 >>>");
            model = scanner.nextLine();
            System.out.println("색상 >>>");
            color = scanner.nextLine();
            Car car = new Car(model, color); //entity
            carService.append(car);
        } else if ("2".equals(selectedMenu)) {
            carService.printCarList();
        }  else {
                    System.out.println("다시 입력하세요.");
        }

}
    System.out.println("프로그램이 종료되었습니다.");
}
}

