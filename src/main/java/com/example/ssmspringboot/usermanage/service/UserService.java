package com.example.ssmspringboot.usermanage.service;

import com.example.ssmspringboot.usermanage.po.User;

public interface UserService {
    public User findUser(String usercode, String password);
}
