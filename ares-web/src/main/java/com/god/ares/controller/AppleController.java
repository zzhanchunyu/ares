package com.god.ares.controller;

import com.god.ares.command.*;
import com.god.ares.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chunyuz_3
 * @date 2018/12/4
 */
@RestController
@RequestMapping("/apple")
public class AppleController {

    @Autowired
    private CommandFactory commandFactory;

    @RequestMapping("/getMac")
    public APIResponse<User> getAppleMac(@RequestBody AppleRequest request) {
        Command command = commandFactory.getCommand(CommandType.APPLE_MAC);
        APIResponse<User> response = command.execute(request);
        return response;
    }
}

