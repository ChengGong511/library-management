package com.mapper;

import com.controller.reqeuest.UserPageRequest;
import com.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public  List<User> list();

    public List<User> listByCondition(UserPageRequest userPageRequest);

}
