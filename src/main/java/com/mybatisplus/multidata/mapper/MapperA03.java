package com.mybatisplus.multidata.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatisplus.multidata.module.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author yyuanyan
 * @create 2020 - 04 - 04 - 0:42
 */

@DS(value = "a03")
@Mapper
public interface MapperA03 extends BaseMapper<UserInfo> {
    @Select("SELECT * FROM user_info")
    List<UserInfo> getAllUser();
}
