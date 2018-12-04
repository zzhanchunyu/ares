package com.god.ares.command;

import com.god.ares.model.User;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author chunyuz_3
 * @date 2018/12/4
 */
@Component
public class AppleMacCmd extends AppleCmd<AppleRequest> {

    @Override
    protected APIResponse<User> checkParam(AppleRequest req) {
        if (Objects.isNull(req)) {
            return APIResponse.returnFail("请求参数不可为空");
        }
        if (Objects.isNull(req.getUserId())) {
            return APIResponse.returnFail("无效的用户id");
        }
        if (req.getPrice() < 10000) {
            return APIResponse.returnFail("哪有这么便宜的mac");
        }
        User user = userService.selectByPrimaryKey(req.getUserId());
        return APIResponse.returnSuccess(user);
    }

    @Override
    protected APIResponse process(AppleRequest req, User user) {
        logger.info("{}===process", getName());
        return APIResponse.returnSuccess(user);
    }

    @Override
    public String getName() {
        return "AppleMacCmd";
    }
}
