package com.example.ssmspringboot.usermanage.dao;

import com.example.ssmspringboot.usermanage.domain.Userold;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper     //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface UserMapper {
    Userold selectUserByName(String name);
    List<Userold> findAll();
}