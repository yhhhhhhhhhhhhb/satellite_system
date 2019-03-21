package com.satellite.system.bean;

import java.util.Date;

public class TTaskAllocation {

    private Integer id;

    private Integer taskNumber;

    private String stationNumber;

    private Integer satelliteNumber;

    private Integer taskType;

    private Date developmentDate;

    private Date plannedStartDate;

    private Date planDeadline;

    private Date taskStartDate;

    private Date taskEndDate;

    private Integer distributionMark;

    private Integer dataDistributionFlag;

    private String ack;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(Integer taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(String stationNumber) {
        this.stationNumber = stationNumber == null ? null : stationNumber.trim();
    }

    public Integer getSatelliteNumber() {
        return satelliteNumber;
    }

    public void setSatelliteNumber(Integer satelliteNumber) {
        this.satelliteNumber = satelliteNumber;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public Date getDevelopmentDate() {
        return developmentDate;
    }

    public void setDevelopmentDate(Date developmentDate) {
        this.developmentDate = developmentDate;
    }

    public Date getPlannedStartDate() {
        return plannedStartDate;
    }

    public void setPlannedStartDate(Date plannedStartDate) {
        this.plannedStartDate = plannedStartDate;
    }

    public Date getPlanDeadline() {
        return planDeadline;
    }

    public void setPlanDeadline(Date planDeadline) {
        this.planDeadline = planDeadline;
    }

    public Date getTaskStartDate() {
        return taskStartDate;
    }

    public void setTaskStartDate(Date taskStartDate) {
        this.taskStartDate = taskStartDate;
    }

    public Date getTaskEndDate() {
        return taskEndDate;
    }

    public void setTaskEndDate(Date taskEndDate) {
        this.taskEndDate = taskEndDate;
    }

    public Integer getDistributionMark() {
        return distributionMark;
    }

    public void setDistributionMark(Integer distributionMark) {
        this.distributionMark = distributionMark;
    }

    public Integer getDataDistributionFlag() {
        return dataDistributionFlag;
    }

    public void setDataDistributionFlag(Integer dataDistributionFlag) {
        this.dataDistributionFlag = dataDistributionFlag;
    }

    public String getAck() {
        return ack;
    }

    public void setAck(String ack) {
        this.ack = ack == null ? null : ack.trim();
    }

    public TTaskAllocation() {
    }

    public TTaskAllocation(String stationNumber, Integer satelliteNumber, Integer taskType, Date plannedStartDate, Date planDeadline) {
        this.stationNumber = stationNumber;
        this.satelliteNumber = satelliteNumber;
        this.taskType = taskType;
        this.plannedStartDate = plannedStartDate;
        this.planDeadline = planDeadline;
    }
}