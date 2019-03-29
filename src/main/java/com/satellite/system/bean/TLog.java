package com.satellite.system.bean;

import java.util.Date;

public class TLog {
    private Integer id;

    private Date datetime;

    private String object;

    private Integer type;

    private String data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object == null ? null : object.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public TLog(Date datetime, String object, Integer type, String data) {
        this.datetime = datetime;
        this.object = object;
        this.type = type;
        this.data = data;
    }

    public TLog() {
    }
}