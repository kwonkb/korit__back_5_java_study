package com.study.ch08.member;

import java.util.Scanner;

public class  MemberMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
        Member[] members = new Member[4];

        String selectedMenu = null;


        while (true) {
            System.out.println("[[회원 관리 프로그램]]");
            System.out.println("1.회원 등록");
            System.out.println("2.회원 전체 조회");
            System.out.println("q.프로그램 종료하기");

            System.out.print("메뉴 선택 >>>");
            selectedMenu = scanner.nextLine();


            if("1".equals(selectedMenu)) {
                int emptyCount = 0;
                for(int i = 0; i < members.length; i++){
                    if(members[i] == null){
                        emptyCount++;
                    }
                }
                if(emptyCount == 0) {
                    System.out.println("회원을 등록할 수 없습니다.");
                    continue;
                }

                boolean responseData = memberService.addMember(members);
                if(responseData) {
                    System.out.println("<<< 등록 완료 >>>");
                    System.out.println( "등록 가능한 회원 수는 " + (emptyCount-1) + "명 입니다.");
                } else {
                    System.out.println("<<< 등록 취소 >>>");
                }

            } else if ("2".equalsIgnoreCase(selectedMenu)) {
                for(int i = 0; i < members.length; i++) {
                    if(members[i] == null) {
                        System.out.println("NULL");
                        continue;
                    }
                    System.out.println(members[i].toString());
                }
            }
            else if ("q".equalsIgnoreCase(selectedMenu) || "ㅂ".equalsIgnoreCase(selectedMenu)) {
                break;
            } else {
                System.out.println("다시 선택하세요.");
            }

            System.out.println();
        }
        System.out.println();
        System.out.println("<<<<<< 프로그램이 종료되었습니다. >>>>>>");
    }
}
