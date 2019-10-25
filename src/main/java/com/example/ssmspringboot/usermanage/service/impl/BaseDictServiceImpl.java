package com.example.ssmspringboot.usermanage.service.impl;


import com.example.ssmspringboot.usermanage.dao.BaseDictDao;
import com.example.ssmspringboot.usermanage.po.BaseDict;
import com.example.ssmspringboot.usermanage.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("baseDictService")
public class BaseDictServiceImpl implements BaseDictService {
    @Autowired
    private BaseDictDao baseDictDao;
    //根据类别代码查询数据字典
    public List<BaseDict> findBaseDictByTypeCode(String typecode) {
        return baseDictDao.selectBaseDictByTypeCode(typecode);
    }

}
