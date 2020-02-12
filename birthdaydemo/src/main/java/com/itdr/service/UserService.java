package com.itdr.service;

import com.itdr.pojo.Users;

import java.util.List;

public interface UserService {
    List<Users> getAll();

    int addOne();

    Users login(String username,String password);

    List<Users> cc();
}
