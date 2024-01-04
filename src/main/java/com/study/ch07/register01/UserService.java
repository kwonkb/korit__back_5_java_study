package com.study.ch07.register01;

public class UserService {

    Boolean isEmptyString(String str) {
        if (str == null) {
            return true;
        }
        return str.isBlank();
    }

    void registerProductService(User user) {
        UserRepository userRepository = new UserRepository();
        System.out.println("서비스까지 데이터 전달함.");
        userRepository.saveUser(user);
    }
}
