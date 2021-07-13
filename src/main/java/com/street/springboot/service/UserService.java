package com.street.springboot.service;

import com.street.springboot.bean.User;
import org.apache.ibatis.annotations.Param;
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
public interface UserService {

    //学生登录
    public List<User> studentLogin(User user);
    //查询所有学生
    public List<User> allUser(Map<Object,Object> info);

}
