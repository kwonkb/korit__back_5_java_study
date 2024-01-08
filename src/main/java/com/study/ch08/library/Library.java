package com.study.ch08.library;

public class Library {
    String title;
    String author;

    Library (String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "책 제목 " + '"' + title + '"' + "와(과) " + "저자 " + '"' + author + '"';
    }
}
