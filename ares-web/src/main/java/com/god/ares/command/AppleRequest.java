package com.god.ares.command;

/**
 * @author chunyuz_3
 * @date 2018/12/4
 */
public class AppleRequest {

    private Integer userId;

    private String type;

    private Integer price;

    private String color;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
