package com.example.ssmspringboot.usermanage.dao;

import com.example.ssmspringboot.usermanage.po.BaseDict;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BaseDictDao {
    //根据类别代码查询数据字典
    public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}
