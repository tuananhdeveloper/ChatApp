package com.tuananh.ChatApp.enities;

import java.io.Serializable;

public class User extends BaseModel implements Serializable {

    private static final long serialVersionUID = 5706739933426877475L;

    private Integer id;
    private String email;
    private String username;
    private String password;

    public User(String createBy, String createDate, String updateBy, String updateDate, Integer id, String email, String username, String password) {
        super(createBy, createDate, updateBy, updateDate);
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public User(String createBy, String createDate, String updateBy, String updateDate) {
        super(createBy, createDate, updateBy, updateDate);
    }

    @Override
    public String getCreateBy() {
        return super.getCreateBy();
    }

    @Override
    public void setCreateBy(String createBy) {
        super.setCreateBy(createBy);
    }

    @Override
    public String getCreateDate() {
        return super.getCreateDate();
    }

    @Override
    public void setCreateDate(String createDate) {
        super.setCreateDate(createDate);
    }

    @Override
    public String getUpdateBy() {
        return super.getUpdateBy();
    }

    @Override
    public void setUpdateBy(String updateBy) {
        super.setUpdateBy(updateBy);
    }

    @Override
    public String getUpdateDate() {
        return super.getUpdateDate();
    }

    @Override
    public void setUpdateDate(String updateDate) {
        super.setUpdateDate(updateDate);
    }
}
