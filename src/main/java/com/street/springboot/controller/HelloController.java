package com.street.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.street.springboot.bean.User;
import com.street.springboot.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/12 09:22
 * @desc:
 */
@Controller
@RequestMapping("/admin")
public class HelloController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/tologin")
    public String tologin(){

        return "views/login";
    }

    @RequestMapping("/loginindex")
    public String index(){

        return "index";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){
        return "hellospringboot";
    }


    @RequestMapping("/index")
    @ResponseBody
    public String Hello2(User user){
        List<User> users = userServiceImpl.studentLogin(user);
        System.out.println(userServiceImpl.studentLogin(user));

        if (!users.isEmpty()){
            return "success";
        }else {
            return "err";
        }

    }

    @RequestMapping("/allUser")
    @ResponseBody
    public String allUser(String pageSize,String currPage){
        int pageSize1 = Integer.valueOf(pageSize);
        int currPage1 = Integer.valueOf(currPage);
        System.err.println(pageSize1+"--------"+currPage1);
        System.out.println("从第"+((currPage1-1)*pageSize1)+"条开始查找，查找"+pageSize1+"条");
        Map<Object,Object> info = new HashMap<>();
        info.put("pageSize",((currPage1-1)*pageSize1));
        info.put("currPage",pageSize1);
        System.out.println(userServiceImpl.allUser(info));
        String objStr = JSON.toJSONString(userServiceImpl.allUser(info));
        return objStr;
    }


}
