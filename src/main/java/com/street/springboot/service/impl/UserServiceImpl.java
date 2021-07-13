package com.street.springboot.service.impl;

import com.street.springboot.bean.User;
import com.street.springboot.dao.UserMapper;
import com.street.springboot.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/10 13:28
 * @desc:
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    /**
     * @Description: 学生登录
     * @Param:
     * @Author: BWL
     * @Date: 2021-06-14 16:35
     */
    @Override
    public List<User> studentLogin(User user) {
        List<User> falgk = userMapper.studentLogin(user);
        return falgk;
    }
    //查询所有学生
    @Override
    public List<User> allUser(Map<Object, Object> info) {
        return userMapper.allUser(info);
    }

}
