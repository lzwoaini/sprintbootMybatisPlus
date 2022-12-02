package com.example.sprintbootmybatisplus;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.example.sprintbootmybatisplus.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/test")
    public void test(){
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
        //刘政的第一次更改
    }
}
