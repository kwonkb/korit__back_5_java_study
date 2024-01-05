package com.study.ch08.member;

public class Member {

    String name;
    String character;
    Double level;
    String characterClass;

    Member(String name ,String character,  Double level, String characterClass) {
        this.name = name;
        this.character = character;
        this.level = level;
        this.characterClass = characterClass;
    }

    @Override
    public String toString() {
        return  "이름: " + name + " , "
                + "클래스: " + character + " , "
                + "아이템 레벨: " + level + " , "
                + "직업: " + characterClass;
    }
}
