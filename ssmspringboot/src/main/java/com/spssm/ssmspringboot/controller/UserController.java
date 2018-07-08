package com.spssm.ssmspringboot.controller;

import com.spssm.ssmspringboot.mapper.UserMapper;
import com.spssm.ssmspringboot.model.Teacher;
import com.spssm.ssmspringboot.model.UserModel;
import com.spssm.ssmspringboot.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/")
    public String index()
    {
        return "index";
    }
    @Autowired
    UserServiceImpl userService;
    @RequestMapping("/all")

    public String getall(Model m)
    {
        //
        List<Teacher> list = userService.getAll();
        m.addAttribute("user",list);
        return "UserMan";
    }

    @RequestMapping("/inserUser")

    public String inserUser(Model m)
    {
        //
        UserModel us = new UserModel();
        us.setAccount(18.);
        us.setUsername("2018-7-2imaye");
        us.setPassword("23123123123");
        return userService.inserUser(us);
//        m.addAttribute("user",list);
//        return "UserMan";
    }

    @RequestMapping("/getAllUser")

    public String getAllUserModel(Model m)
    {
        //
        List<UserModel> list = userService.getAllUserModel();
        m.addAttribute("user",list);
        return "UserMan";
    }
}
