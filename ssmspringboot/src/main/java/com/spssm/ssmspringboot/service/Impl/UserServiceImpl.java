package com.spssm.ssmspringboot.service.Impl;

import com.spssm.ssmspringboot.mapper.UserMapper;
import com.spssm.ssmspringboot.model.Classes;
import com.spssm.ssmspringboot.model.Teacher;
import com.spssm.ssmspringboot.model.UserModel;
import com.spssm.ssmspringboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service

public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    public List<UserModel> getAllUserModel()
    {
        return null;//  userMapperXml.getAllUserModel();
    }
    public String inserUser(UserModel user)
    {
        System.out.println("service");
        if(userMapper.insertUser(user)>0)
        {
            return "success";
        }
        return "index";
//        return ;
    }
    public List<Classes> getClassAndTeach(){
        return null;// userMapperXml.getClassAndTeach();
    }

    public List<Teacher> getAll() {
        return null;// userMapper.findAll();
    }
}
