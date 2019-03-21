package com.satellite.system.bean;

import java.util.Date;

public class TChartEarlyWarning {
    private Long id;

    private String chartId;

    private String earlyWarningJson;

    private Long dsType;

    private String dbTable;

    private String earlyWarningExpression;

    private String mobile;

    private String warningUser;

    private String createUser;

    private String updateUser;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChartId() {
        return chartId;
    }

    public void setChartId(String chartId) {
        this.chartId = chartId == null ? null : chartId.trim();
    }

    public String getEarlyWarningJson() {
        return earlyWarningJson;
    }

    public void setEarlyWarningJson(String earlyWarningJson) {
        this.earlyWarningJson = earlyWarningJson == null ? null : earlyWarningJson.trim();
    }

    public Long getDsType() {
        return dsType;
    }

    public void setDsType(Long dsType) {
        this.dsType = dsType;
    }

    public String getDbTable() {
        return dbTable;
    }

    public void setDbTable(String dbTable) {
        this.dbTable = dbTable == null ? null : dbTable.trim();
    }

    public String getEarlyWarningExpression() {
        return earlyWarningExpression;
    }

    public void setEarlyWarningExpression(String earlyWarningExpression) {
        this.earlyWarningExpression = earlyWarningExpression == null ? null : earlyWarningExpression.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getWarningUser() {
        return warningUser;
    }

    public void setWarningUser(String warningUser) {
        this.warningUser = warningUser == null ? null : warningUser.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}