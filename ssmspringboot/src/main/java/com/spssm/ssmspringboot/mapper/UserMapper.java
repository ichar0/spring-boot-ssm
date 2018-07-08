package com.spssm.ssmspringboot.mapper;

import com.spssm.ssmspringboot.model.Teacher;

import com.spssm.ssmspringboot.model.UserModel;
import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface UserMapper {

//    @Select("select t_id ,t_name  from teacher")
////    @Results({
////            @Result(column="t_id", property="id"),
////            @Result(column="t_name", property="name"),
//////            @Result(column="teacher_id", property="teacherId")
////    })
////    List<Teacher> findAll();
    int insertUser(UserModel userModel);
    //        List<Classes> getClassAndTeach();
//        List<Classes> getAllstudnet();
//        List<UserModel> getAllUserModel();
}
