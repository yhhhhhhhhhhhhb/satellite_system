package com.satellite.system.bean;

import java.util.Date;

public class TSatelliteInfo {
    private Integer id;

    private String number;

    private String nasa_number;

    private String name;

    private String constellation_number;

    private String type;

    private String telemetry_frequency;

    private String telemetry_erp_value;

    private String remote_frequency;

    private String remote_receiving_gain;

    private String data_downlink;

    private String erp_value;

    private String data_uplink_frequency;

    private String data_uplink_receive_gain;

    private String business_downlink_frequency;

    private String business_downlink_erp_value;

    private String business_uplink_frequency;

    private String service_uplink_receive_gain;

    private Float inclination;

    private Float ascending_point;

    private Float eccentricity;

    private Float semi_long_axis;

    private Float perigee_angular_distance;

    private Float perigee_moment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getNasa_number() {
        return nasa_number;
    }

    public void setNasa_number(String nasa_number) {
        this.nasa_number = nasa_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConstellation_number() {
        return constellation_number;
    }

    public void setConstellation_number(String constellation_number) {
        this.constellation_number = constellation_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTelemetry_frequency() {
        return telemetry_frequency;
    }

    public void setTelemetry_frequency(String telemetry_frequency) {
        this.telemetry_frequency = telemetry_frequency;
    }

    public String getTelemetry_erp_value() {
        return telemetry_erp_value;
    }

    public void setTelemetry_erp_value(String telemetry_erp_value) {
        this.telemetry_erp_value = telemetry_erp_value;
    }

    public String getRemote_frequency() {
        return remote_frequency;
    }

    public void setRemote_frequency(String remote_frequency) {
        this.remote_frequency = remote_frequency;
    }

    public String getRemote_receiving_gain() {
        return remote_receiving_gain;
    }

    public void setRemote_receiving_gain(String remote_receiving_gain) {
        this.remote_receiving_gain = remote_receiving_gain;
    }

    public String getData_downlink() {
        return data_downlink;
    }

    public void setData_downlink(String data_downlink) {
        this.data_downlink = data_downlink;
    }

    public String getErp_value() {
        return erp_value;
    }

    public void setErp_value(String erp_value) {
        this.erp_value = erp_value;
    }

    public String getData_uplink_frequency() {
        return data_uplink_frequency;
    }

    public void setData_uplink_frequency(String data_uplink_frequency) {
        this.data_uplink_frequency = data_uplink_frequency;
    }

    public String getData_uplink_receive_gain() {
        return data_uplink_receive_gain;
    }

    public void setData_uplink_receive_gain(String data_uplink_receive_gain) {
        this.data_uplink_receive_gain = data_uplink_receive_gain;
    }

    public String getBusiness_downlink_frequency() {
        return business_downlink_frequency;
    }

    public void setBusiness_downlink_frequency(String business_downlink_frequency) {
        this.business_downlink_frequency = business_downlink_frequency;
    }

    public String getBusiness_downlink_erp_value() {
        return business_downlink_erp_value;
    }

    public void setBusiness_downlink_erp_value(String business_downlink_erp_value) {
        this.business_downlink_erp_value = business_downlink_erp_value;
    }

    public String getBusiness_uplink_frequency() {
        return business_uplink_frequency;
    }

    public void setBusiness_uplink_frequency(String business_uplink_frequency) {
        this.business_uplink_frequency = business_uplink_frequency;
    }

    public String getService_uplink_receive_gain() {
        return service_uplink_receive_gain;
    }

    public void setService_uplink_receive_gain(String service_uplink_receive_gain) {
        this.service_uplink_receive_gain = service_uplink_receive_gain;
    }

    public Float getInclination() {
        return inclination;
    }

    public void setInclination(Float inclination) {
        this.inclination = inclination;
    }

    public Float getAscending_point() {
        return ascending_point;
    }

    public void setAscending_point(Float ascending_point) {
        this.ascending_point = ascending_point;
    }

    public Float getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(Float eccentricity) {
        this.eccentricity = eccentricity;
    }

    public Float getSemi_long_axis() {
        return semi_long_axis;
    }

    public void setSemi_long_axis(Float semi_long_axis) {
        this.semi_long_axis = semi_long_axis;
    }

    public Float getPerigee_angular_distance() {
        return perigee_angular_distance;
    }

    public void setPerigee_angular_distance(Float perigee_angular_distance) {
        this.perigee_angular_distance = perigee_angular_distance;
    }

    public Float getPerigee_moment() {
        return perigee_moment;
    }

    public void setPerigee_moment(Float perigee_moment) {
        this.perigee_moment = perigee_moment;
    }

    public TSatelliteInfo() {
    }

    public TSatelliteInfo(String number, String nasa_number, String name, String constellation_number, String type, String telemetry_frequency, String telemetry_erp_value, String remote_frequency, String remote_receiving_gain, String data_downlink, String erp_value, String data_uplink_frequency, String data_uplink_receive_gain, String business_downlink_frequency, String business_downlink_erp_value, String business_uplink_frequency, String service_uplink_receive_gain, Float inclination, Float ascending_point, Float eccentricity, Float semi_long_axis, Float perigee_angular_distance, Float perigee_moment) {
        this.number = number;
        this.nasa_number = nasa_number;
        this.name = name;
        this.constellation_number = constellation_number;
        this.type = type;
        this.telemetry_frequency = telemetry_frequency;
        this.telemetry_erp_value = telemetry_erp_value;
        this.remote_frequency = remote_frequency;
        this.remote_receiving_gain = remote_receiving_gain;
        this.data_downlink = data_downlink;
        this.erp_value = erp_value;
        this.data_uplink_frequency = data_uplink_frequency;
        this.data_uplink_receive_gain = data_uplink_receive_gain;
        this.business_downlink_frequency = business_downlink_frequency;
        this.business_downlink_erp_value = business_downlink_erp_value;
        this.business_uplink_frequency = business_uplink_frequency;
        this.service_uplink_receive_gain = service_uplink_receive_gain;
        this.inclination = inclination;
        this.ascending_point = ascending_point;
        this.eccentricity = eccentricity;
        this.semi_long_axis = semi_long_axis;
        this.perigee_angular_distance = perigee_angular_distance;
        this.perigee_moment = perigee_moment;
    }
}