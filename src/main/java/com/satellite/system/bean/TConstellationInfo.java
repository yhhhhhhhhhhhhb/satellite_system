package com.satellite.system.bean;

public class TConstellationInfo {
    private Integer id;

    private String number;

    private String name;

    private Integer type;

    private String belonePeople;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getBelonePeople() {
        return belonePeople;
    }

    public void setBelonePeople(String belonePeople) {
        this.belonePeople = belonePeople == null ? null : belonePeople.trim();
    }
}