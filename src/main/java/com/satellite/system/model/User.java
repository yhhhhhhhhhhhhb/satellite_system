package com.satellite.system.model;

import java.util.Date;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 23:03 2019/3/21
 * @Modified By:
 */
public class User {


    private String userName;

    private String passWord;

    private String permission;

    private Date createTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User(String userName, String passWord, String permission, Date createTime) {
        this.userName = userName;
        this.passWord = passWord;
        this.permission = permission;
        this.createTime = createTime;
    }

    public User() {
    }
}
