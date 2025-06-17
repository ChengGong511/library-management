package com.service;

import com.controller.reqeuest.UserPageRequest;
import com.entity.User;

import java.util.List;

public interface UserService {
    public List<User> list();

    public Object page(UserPageRequest userPageRequest);
}
