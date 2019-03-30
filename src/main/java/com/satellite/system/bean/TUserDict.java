package com.satellite.system.bean;

import java.util.Date;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 12:37 2019/3/30
 * @Modified By:
 */
public class TUserDict {

    private Integer id;
    private String username;
    private String token;
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TUserDict() {
    }

    public TUserDict(String username, String token, Date date) {
        this.username = username;
        this.token = token;
        this.date = date;
    }
}
