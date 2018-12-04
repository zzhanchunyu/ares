package com.god.ares.command;

/**
 * @author chunyuz_3
 * @date 2018/12/4
 */
public enum CommandType {

    APPLE_MAC(1, "苹果笔记本"),
    APPLE_IPAD(2, "苹果平板"),
    APPLE_IPHONE(3, "苹果手机"),
    ;

    CommandType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
