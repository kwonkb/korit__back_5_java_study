package com.study.ch07.register01;

public class UserRepository {
    void saveUser(User user){
        UserDB userDB = new UserDB();
        userDB.insertUserInfo(user);

    }
}
