package com.vitias.geo_calculate.data.dto;

public class LocationData {

    private String status;
    private String balance;
    private String lat;
    private String lon;
    private Integer accuracy;
    private String address;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }

    public Integer getMistake() {
        return accuracy;
    }

}
