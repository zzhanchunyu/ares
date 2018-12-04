package com.god.ares.command;

import com.god.ares.model.User;
import com.god.ares.rpc.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author chunyuz_3
 * @date 2018/12/4
 */
@Component
public abstract class AppleCmd<T> implements Command<T> {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    protected UserService userService;

    protected abstract APIResponse<User> checkParam(T arg);

    protected abstract APIResponse process(T arg, User user);

    @Override
    public APIResponse execute(T arg) {
        long start = System.currentTimeMillis();
        try {
            APIResponse<User> response = checkParam(arg);
            if (!response.isRet()) {
                logger.warn("[{}]参数校验失败: code={}, msg={}", getName(), response.getErrcode(), response.getErrmsg());
                return response;
            }
            return process(arg, response.getData());
        } catch (Throwable e) {
            logger.error("execute onError fail", e);
            return APIResponse.returnFail("未知错误");
        } finally {
            logger.info("{}执行时间，{}ms", getName(), System.currentTimeMillis() - start);
        }
    }
}
