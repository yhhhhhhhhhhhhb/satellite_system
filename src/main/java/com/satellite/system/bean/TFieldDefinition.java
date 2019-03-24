package com.satellite.system.bean;

public class TFieldDefinition {
    private Integer id;

    private String name;

    private Integer data_type;

    private Double max_value;

    private Double min_value;

    private String unit;

    private Byte display_sign;

    private String equipment_name;

    private Integer satellite_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getData_type() {
        return data_type;
    }

    public void setData_type(Integer data_type) {
        this.data_type = data_type;
    }

    public Double getMax_value() {
        return max_value;
    }

    public void setMax_value(Double max_value) {
        this.max_value = max_value;
    }

    public Double getMin_value() {
        return min_value;
    }

    public void setMin_value(Double min_value) {
        this.min_value = min_value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Byte getDisplay_sign() {
        return display_sign;
    }

    public void setDisplay_sign(Byte display_sign) {
        this.display_sign = display_sign;
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    public Integer getSatellite_id() {
        return satellite_id;
    }

    public void setSatellite_id(Integer satellite_id) {
        this.satellite_id = satellite_id;
    }
}