package com.spssm.ssmspringboot.service;

import com.spssm.ssmspringboot.mapper.UserMapper;
import com.spssm.ssmspringboot.model.Classes;
import com.spssm.ssmspringboot.model.UserModel;

import java.util.List;

public interface IUserService extends PubService{
    //List<UserModel> getAllUser();
    List<UserModel> getAllUserModel();
    String inserUser(UserModel user);
    List<Classes> getClassAndTeach();

}
