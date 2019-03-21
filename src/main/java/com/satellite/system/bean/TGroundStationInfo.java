package com.satellite.system.bean;

public class TGroundStationInfo {
    private Integer id;

    private String number;

    private String name;

    private String type;

    private String telemetryFrequency;

    private String telemetryGain;

    private String remoteControlFrequency;

    private String remoteErpValue;

    private String dataDownlinkFrequency;

    private String dataDownlinkGain;

    private String dataUplinkFrequency;

    private String dataUplinkErpValue;

    private Float longitude;

    private Float latitude;

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

    public String getTelemetryFrequency() {
        return telemetryFrequency;
    }

    public void setTelemetryFrequency(String telemetryFrequency) {
        this.telemetryFrequency = telemetryFrequency == null ? null : telemetryFrequency.trim();
    }

    public String getTelemetryGain() {
        return telemetryGain;
    }

    public void setTelemetryGain(String telemetryGain) {
        this.telemetryGain = telemetryGain == null ? null : telemetryGain.trim();
    }

    public String getRemoteControlFrequency() {
        return remoteControlFrequency;
    }

    public void setRemoteControlFrequency(String remoteControlFrequency) {
        this.remoteControlFrequency = remoteControlFrequency == null ? null : remoteControlFrequency.trim();
    }

    public String getRemoteErpValue() {
        return remoteErpValue;
    }

    public void setRemoteErpValue(String remoteErpValue) {
        this.remoteErpValue = remoteErpValue == null ? null : remoteErpValue.trim();
    }

    public String getDataDownlinkFrequency() {
        return dataDownlinkFrequency;
    }

    public void setDataDownlinkFrequency(String dataDownlinkFrequency) {
        this.dataDownlinkFrequency = dataDownlinkFrequency == null ? null : dataDownlinkFrequency.trim();
    }

    public String getDataDownlinkGain() {
        return dataDownlinkGain;
    }

    public void setDataDownlinkGain(String dataDownlinkGain) {
        this.dataDownlinkGain = dataDownlinkGain == null ? null : dataDownlinkGain.trim();
    }

    public String getDataUplinkFrequency() {
        return dataUplinkFrequency;
    }

    public void setDataUplinkFrequency(String dataUplinkFrequency) {
        this.dataUplinkFrequency = dataUplinkFrequency == null ? null : dataUplinkFrequency.trim();
    }

    public String getDataUplinkErpValue() {
        return dataUplinkErpValue;
    }

    public void setDataUplinkErpValue(String dataUplinkErpValue) {
        this.dataUplinkErpValue = dataUplinkErpValue == null ? null : dataUplinkErpValue.trim();
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}