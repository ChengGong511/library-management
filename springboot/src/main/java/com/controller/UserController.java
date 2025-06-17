package com.controller;

import com.controller.reqeuest.UserPageRequest;
import com.entity.Result;
import com.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;
    private static Logger log = LoggerFactory.getLogger(UserController.class);

    @CrossOrigin //解决跨域问题
    @RequestMapping("/list")
    public Result list() {
        log.info("查询全部用户数据");
        return Result.success(userServiceImpl.list());
    }
    @CrossOrigin
    @RequestMapping("/page")
    public Result page(UserPageRequest userPageRequest) {
        return Result.success(userServiceImpl.page(userPageRequest));

    }
}
