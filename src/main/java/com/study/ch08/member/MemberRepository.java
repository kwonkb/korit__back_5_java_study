package com.study.ch08.member;

public class MemberRepository {

    int insert(Member[] members, Member member) {
        for(int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = member;
                break;
            }
        }

        System.out.println();

        System.out.println("저장소에 정보를 저장했습니다.");

        System.out.println(member.toString());
        return 1;
    }
}
