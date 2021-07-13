package com.street.springboot.dao;


import com.street.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/10 13:28
 * @desc:
 */
@Repository
@Mapper
public interface UserMapper {

    //学生登录
    List<User> studentLogin(User user);
    //查询所有学生
    List<User> allUser(Map<Object,Object> info);

}
