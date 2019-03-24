package com.satellite.system.bean;

import java.math.BigDecimal;

public class TGroundStationInfo {
    private Integer id;

    private String number;

    private String name;

    private String type;

    private String telemetry_frequency;

    private String telemetry_gain;

    private String remote_control_frequency;

    private String remote_erp_value;

    private String data_downlink_frequency;

    private String data_downlink_gain;

    private String data_uplink_frequency;

    private String data_uplink_erp_value;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String address;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTelemetry_frequency() {
        return telemetry_frequency;
    }

    public void setTelemetry_frequency(String telemetry_frequency) {
        this.telemetry_frequency = telemetry_frequency;
    }

    public String getTelemetry_gain() {
        return telemetry_gain;
    }

    public void setTelemetry_gain(String telemetry_gain) {
        this.telemetry_gain = telemetry_gain;
    }

    public String getRemote_control_frequency() {
        return remote_control_frequency;
    }

    public void setRemote_control_frequency(String remote_control_frequency) {
        this.remote_control_frequency = remote_control_frequency;
    }

    public String getRemote_erp_value() {
        return remote_erp_value;
    }

    public void setRemote_erp_value(String remote_erp_value) {
        this.remote_erp_value = remote_erp_value;
    }

    public String getData_downlink_frequency() {
        return data_downlink_frequency;
    }

    public void setData_downlink_frequency(String data_downlink_frequency) {
        this.data_downlink_frequency = data_downlink_frequency;
    }

    public String getData_downlink_gain() {
        return data_downlink_gain;
    }

    public void setData_downlink_gain(String data_downlink_gain) {
        this.data_downlink_gain = data_downlink_gain;
    }

    public String getData_uplink_frequency() {
        return data_uplink_frequency;
    }

    public void setData_uplink_frequency(String data_uplink_frequency) {
        this.data_uplink_frequency = data_uplink_frequency;
    }

    public String getData_uplink_erp_value() {
        return data_uplink_erp_value;
    }

    public void setData_uplink_erp_value(String data_uplink_erp_value) {
        this.data_uplink_erp_value = data_uplink_erp_value;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public TGroundStationInfo() {
    }

    public TGroundStationInfo(String number, String name, String type, String telemetry_frequency, String telemetry_gain, String remote_control_frequency, String remote_erp_value, String data_downlink_frequency, String data_downlink_gain, String data_uplink_frequency, String data_uplink_erp_value, BigDecimal longitude, BigDecimal latitude, String address) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.telemetry_frequency = telemetry_frequency;
        this.telemetry_gain = telemetry_gain;
        this.remote_control_frequency = remote_control_frequency;
        this.remote_erp_value = remote_erp_value;
        this.data_downlink_frequency = data_downlink_frequency;
        this.data_downlink_gain = data_downlink_gain;
        this.data_uplink_frequency = data_uplink_frequency;
        this.data_uplink_erp_value = data_uplink_erp_value;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = address;
    }
}