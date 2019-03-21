package com.satellite.system.bean;

import java.util.Date;

public class TSatelliteInfo {
    private Integer id;

    private String number;

    private String nasaNumber;

    private String name;

    private String constellationNumber;

    private String type;

    private String telemetryFrequency;

    private String telemetryErpValue;

    private String remoteFrequency;

    private String remoteReceivingGain;

    private String dataDownlink;

    private String erpValue;

    private String dataUplinkFrequency;

    private String dataUplinkReceiveGain;

    private String businessDownlinkFrequency;

    private String businessDownlinkErpValue;

    private String businessUplinkFrequency;

    private String serviceUplinkReceiveGain;

    private Float inclination;

    private Float ascendingPoint;

    private Float eccentricity;

    private Float semiLongAxis;

    private Float perigeeAngularDistance;

    private Date perigeeMoment;

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

    public String getNasaNumber() {
        return nasaNumber;
    }

    public void setNasaNumber(String nasaNumber) {
        this.nasaNumber = nasaNumber == null ? null : nasaNumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getConstellationNumber() {
        return constellationNumber;
    }

    public void setConstellationNumber(String constellationNumber) {
        this.constellationNumber = constellationNumber == null ? null : constellationNumber.trim();
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

    public String getTelemetryErpValue() {
        return telemetryErpValue;
    }

    public void setTelemetryErpValue(String telemetryErpValue) {
        this.telemetryErpValue = telemetryErpValue == null ? null : telemetryErpValue.trim();
    }

    public String getRemoteFrequency() {
        return remoteFrequency;
    }

    public void setRemoteFrequency(String remoteFrequency) {
        this.remoteFrequency = remoteFrequency == null ? null : remoteFrequency.trim();
    }

    public String getRemoteReceivingGain() {
        return remoteReceivingGain;
    }

    public void setRemoteReceivingGain(String remoteReceivingGain) {
        this.remoteReceivingGain = remoteReceivingGain == null ? null : remoteReceivingGain.trim();
    }

    public String getDataDownlink() {
        return dataDownlink;
    }

    public void setDataDownlink(String dataDownlink) {
        this.dataDownlink = dataDownlink == null ? null : dataDownlink.trim();
    }

    public String getErpValue() {
        return erpValue;
    }

    public void setErpValue(String erpValue) {
        this.erpValue = erpValue == null ? null : erpValue.trim();
    }

    public String getDataUplinkFrequency() {
        return dataUplinkFrequency;
    }

    public void setDataUplinkFrequency(String dataUplinkFrequency) {
        this.dataUplinkFrequency = dataUplinkFrequency == null ? null : dataUplinkFrequency.trim();
    }

    public String getDataUplinkReceiveGain() {
        return dataUplinkReceiveGain;
    }

    public void setDataUplinkReceiveGain(String dataUplinkReceiveGain) {
        this.dataUplinkReceiveGain = dataUplinkReceiveGain == null ? null : dataUplinkReceiveGain.trim();
    }

    public String getBusinessDownlinkFrequency() {
        return businessDownlinkFrequency;
    }

    public void setBusinessDownlinkFrequency(String businessDownlinkFrequency) {
        this.businessDownlinkFrequency = businessDownlinkFrequency == null ? null : businessDownlinkFrequency.trim();
    }

    public String getBusinessDownlinkErpValue() {
        return businessDownlinkErpValue;
    }

    public void setBusinessDownlinkErpValue(String businessDownlinkErpValue) {
        this.businessDownlinkErpValue = businessDownlinkErpValue == null ? null : businessDownlinkErpValue.trim();
    }

    public String getBusinessUplinkFrequency() {
        return businessUplinkFrequency;
    }

    public void setBusinessUplinkFrequency(String businessUplinkFrequency) {
        this.businessUplinkFrequency = businessUplinkFrequency == null ? null : businessUplinkFrequency.trim();
    }

    public String getServiceUplinkReceiveGain() {
        return serviceUplinkReceiveGain;
    }

    public void setServiceUplinkReceiveGain(String serviceUplinkReceiveGain) {
        this.serviceUplinkReceiveGain = serviceUplinkReceiveGain == null ? null : serviceUplinkReceiveGain.trim();
    }

    public Float getInclination() {
        return inclination;
    }

    public void setInclination(Float inclination) {
        this.inclination = inclination;
    }

    public Float getAscendingPoint() {
        return ascendingPoint;
    }

    public void setAscendingPoint(Float ascendingPoint) {
        this.ascendingPoint = ascendingPoint;
    }

    public Float getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(Float eccentricity) {
        this.eccentricity = eccentricity;
    }

    public Float getSemiLongAxis() {
        return semiLongAxis;
    }

    public void setSemiLongAxis(Float semiLongAxis) {
        this.semiLongAxis = semiLongAxis;
    }

    public Float getPerigeeAngularDistance() {
        return perigeeAngularDistance;
    }

    public void setPerigeeAngularDistance(Float perigeeAngularDistance) {
        this.perigeeAngularDistance = perigeeAngularDistance;
    }

    public Date getPerigeeMoment() {
        return perigeeMoment;
    }

    public void setPerigeeMoment(Date perigeeMoment) {
        this.perigeeMoment = perigeeMoment;
    }
}