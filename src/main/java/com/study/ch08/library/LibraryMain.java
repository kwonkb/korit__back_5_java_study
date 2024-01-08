package com.study.ch08.library;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String selectedMenu = null;
        Boolean loopfrag = true;
        while(loopfrag) {
            Library[] libraries = new Library[5];
            LibraryRepository libraryRepository = new LibraryRepository(libraries);
            LibraryService libraryService = new LibraryService(libraryRepository);
            System.out.println("서적 등록 프로그램");
            System.out.println("1. 서적 등록");
            System.out.println("2. 서적 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴를 선택하세요 >>");
            selectedMenu = sc.nextLine();

            if("1".equalsIgnoreCase(selectedMenu)) {
                libraryService.addBook();
                }

             else if("2".equalsIgnoreCase(selectedMenu)) {
                int emptyCount = 0;
                for(int i = 0; i< libraries.length; i++) {
                    if(libraries[i] != null) {
                        System.out.println("[" + i + "]" + " > " + libraries[i].toString());
                    } else {
                        System.out.println("공");
                    }
                }


            }else if("q".equalsIgnoreCase(selectedMenu) || "ㅂ".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램 종료중 ...");
                loopfrag = false;
            } else {
                System.out.println("다시 입력하세요.");
            }




        }
        System.out.println("프로그램이 종료되었습니다.");


    }
}

