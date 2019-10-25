package com.example.ssmspringboot.usermanage.dao;


import com.example.ssmspringboot.usermanage.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//用户Dao层接口
@Mapper
public interface UserDao {
    public User findUser(@Param("usercode") String usercode,@Param("password") String password);
}
