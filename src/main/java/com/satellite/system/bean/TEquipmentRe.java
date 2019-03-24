package com.satellite.system.bean;

public class TEquipmentRe {
    private Integer id;

    private String equipment_name;

    private String parent_device_name;

    private Integer satellite_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    public String getParent_device_name() {
        return parent_device_name;
    }

    public void setParent_device_name(String parent_device_name) {
        this.parent_device_name = parent_device_name;
    }

    public Integer getSatellite_id() {
        return satellite_id;
    }

    public void setSatellite_id(Integer satellite_id) {
        this.satellite_id = satellite_id;
    }
}