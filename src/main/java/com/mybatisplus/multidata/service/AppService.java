package com.mybatisplus.multidata.service;

import com.mybatisplus.multidata.mapper.MapperA01;
import com.mybatisplus.multidata.mapper.MapperA02;
import com.mybatisplus.multidata.mapper.MapperA03;
import com.mybatisplus.multidata.module.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yyuanyan
 * @create 2020 - 04 - 04 - 0:44
 */

@Service
public class AppService {

    @Autowired
    private MapperA01 mapperA01;

    @Autowired
    private MapperA02 mapperA02;

    @Autowired
    private MapperA03 mapperA03;

    /**
     * 查询A01库中的数据
     *
     * @return 用户信息列表
     */
    public List<UserInfo> getUser01() {
        return mapperA01.getAllUser();
    }

    /**
     * 查询A02库中的数据
     *
     * @return 用户信息列表
     */
    public List<UserInfo> getUser02() {
        return mapperA02.getAllUser();
    }

    /**
     * 查询A03库中的数据
     *
     * @return 用户信息列表
     */
    public List<UserInfo> getUser03() {
        return mapperA03.getAllUser();
    }
}
