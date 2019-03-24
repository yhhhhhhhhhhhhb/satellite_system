package com.satellite.system.bean;

public class TConstellationInfo {
    private Integer id;

    private String number;

    private String name;

    private Integer type;

    private String belone_people;

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

    public String getBelone_people() {
        return belone_people;
    }

    public void setBelone_people(String belone_people) {
        this.belone_people = belone_people;
    }

    public TConstellationInfo() {
    }

    public TConstellationInfo(String number, String name, Integer type, String belone_people) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.belone_people = belone_people;
    }
}