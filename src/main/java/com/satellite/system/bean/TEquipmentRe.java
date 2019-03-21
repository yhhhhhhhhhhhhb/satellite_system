package com.satellite.system.bean;

public class TEquipmentRe {
    private Integer id;

    private String equipmentName;

    private String parentDeviceName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public String getParentDeviceName() {
        return parentDeviceName;
    }

    public void setParentDeviceName(String parentDeviceName) {
        this.parentDeviceName = parentDeviceName == null ? null : parentDeviceName.trim();
    }
}