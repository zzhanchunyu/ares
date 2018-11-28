package com.god.ares.controller;

import com.god.ares.model.User;
import com.god.ares.rpc.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chunyuz_3
 * @date 2018/11/27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    public User getUserById() {
        return userService.selectByPrimaryKey(1);
    }
}
