package com.example.ssmspringboot.usermanage.service.impl;


import com.example.ssmspringboot.usermanage.dao.UserDao;
import com.example.ssmspringboot.usermanage.po.User;
import com.example.ssmspringboot.usermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    // 注入UserDao
    @Autowired
    private UserDao userDao;
    // 通过账号和密码查询用户
    @Override
    public User findUser(String usercode, String password) {
        User user = this.userDao.findUser(usercode, password);
        return user;
    }
}
