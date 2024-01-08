package com.study.ch08.library;

import java.util.Scanner;

public class LibraryService {
    LibraryRepository libraryRepository;

    LibraryService (LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

     void addBook() {
        String title = null;
        String author = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("책 제목을 입력하세요 >>");
        title = scanner.nextLine();
        System.out.println("저자를 입력하세요 >>");
        author = scanner.nextLine();
        Library library = new Library(title, author);
        for(int i = 0; i < libraryRepository.libraries.length; i++) {
            if(libraryRepository.libraries[i] == null) {
                libraryRepository.libraries[i] = library;
                System.out.println("[" + i + "]" + "에 " + libraryRepository.libraries[i].toString() + " 을" + " 저장함.");
                break;
            } else {

            }
        }

    }
}
