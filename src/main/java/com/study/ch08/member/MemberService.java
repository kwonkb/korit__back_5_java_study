package com.study.ch08.member;

import java.util.Scanner;

public class MemberService {

    String inputValue(String label) {
        Scanner scanner = new Scanner(System.in);
        String value = null;
        while (true){
            System.out.print(label + "(입력취소: exit) >>> ");
            value = scanner.nextLine();
            if(!value.isBlank()) {
                break;
            }

        }
        return value;
    }

    boolean addMember(Member[] members) {
        String name = null;
        String charactor = null;
        String level = null;
        String characterClass = null;

        System.out.println("<<< 회원등록 >>>");

        System.out.println();

        name = inputValue("캐릭터 이름");
        if("exit".equalsIgnoreCase(name) || "ㄷ턋".equalsIgnoreCase(name)) {
            return false;
        }
        charactor = inputValue("클래스");
        if("exit".equalsIgnoreCase(charactor) || "ㄷ턋".equalsIgnoreCase(charactor)) {
            return false;
        }
        level = inputValue("아이템 레벨");
        if("exit".equalsIgnoreCase(level) || "ㄷ턋".equalsIgnoreCase(level)) {
            return false;
        }
        characterClass = inputValue("직업");
        if("exit".equalsIgnoreCase(characterClass) || "ㄷ턋".equalsIgnoreCase(characterClass)) {
            return false;
        }

        Member member = new Member(name,charactor,Double.parseDouble(level), characterClass);

        MemberRepository memberRepository = new MemberRepository();


        return memberRepository.insert(members, member) > 0;
    }
}
