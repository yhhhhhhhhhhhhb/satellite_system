package com.satellite.system.bean;

import java.util.Date;

public class TTaskAllocation {
    private Integer id;

    private Integer task_number;

    private String station_number;

    private Integer satellite_number;

    private Integer task_type;

    private Date development_date;

    private Date planned_start_date;

    private Date plan_deadline;

    private Date task_start_date;

    private Date task_end_date;

    private Integer distribution_mark;

    private Integer data_distribution_flag;

    private String ack;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTask_number() {
        return task_number;
    }

    public void setTask_number(Integer task_number) {
        this.task_number = task_number;
    }

    public String getStation_number() {
        return station_number;
    }

    public void setStation_number(String station_number) {
        this.station_number = station_number == null ? null : station_number.trim();
    }

    public Integer getSatellite_number() {
        return satellite_number;
    }

    public void setSatellite_number(Integer satellite_number) {
        this.satellite_number = satellite_number;
    }

    public Integer getTask_type() {
        return task_type;
    }

    public void setTask_type(Integer task_type) {
        this.task_type = task_type;
    }

    public Date getDevelopment_date() {
        return development_date;
    }

    public void setDevelopment_date(Date development_date) {
        this.development_date = development_date;
    }

    public Date getPlanned_start_date() {
        return planned_start_date;
    }

    public void setPlanned_start_date(Date planned_start_date) {
        this.planned_start_date = planned_start_date;
    }

    public Date getPlan_deadline() {
        return plan_deadline;
    }

    public void setPlan_deadline(Date plan_deadline) {
        this.plan_deadline = plan_deadline;
    }

    public Date getTask_start_date() {
        return task_start_date;
    }

    public void setTask_start_date(Date task_start_date) {
        this.task_start_date = task_start_date;
    }

    public Date getTask_end_date() {
        return task_end_date;
    }

    public void setTask_end_date(Date task_end_date) {
        this.task_end_date = task_end_date;
    }

    public Integer getDistribution_mark() {
        return distribution_mark;
    }

    public void setDistribution_mark(Integer distribution_mark) {
        this.distribution_mark = distribution_mark;
    }

    public Integer getData_distribution_flag() {
        return data_distribution_flag;
    }

    public void setData_distribution_flag(Integer data_distribution_flag) {
        this.data_distribution_flag = data_distribution_flag;
    }

    public String getAck() {
        return ack;
    }

    public void setAck(String ack) {
        this.ack = ack == null ? null : ack.trim();
    }

    public TTaskAllocation(String station_number, Integer satellite_number, Integer task_type, Date planned_start_date, Date plan_deadline) {
        this.station_number = station_number;
        this.satellite_number = satellite_number;
        this.task_type = task_type;
        this.planned_start_date = planned_start_date;
        this.plan_deadline = plan_deadline;
    }

    public TTaskAllocation() {
    }
}