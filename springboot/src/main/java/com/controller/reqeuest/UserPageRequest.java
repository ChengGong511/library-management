package com.controller.reqeuest;

import lombok.Data;

@Data
public class UserPageRequest extends BaseRequest{
    private String name;
    private String phone;

}
