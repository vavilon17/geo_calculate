package com.vitias.geo_calculate.data.dto;

import java.util.Date;

public class GeoRequest {

    private String mnc;
    private String mcc;
    private String lac;
    private String cid;
    private String sign;
    private Date timestamp;
    private String bssid;
    private String wifisig;

    public String getMnc() {
        return mnc;
    }

    public void setMnc(String mnc) {
        this.mnc = mnc;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getLac() {
        return lac;
    }

    public void setLac(String lac) {
        this.lac = lac;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getBssid() {
        return bssid;
    }

    public void setBssid(String bssid) {
        this.bssid = bssid;
    }

    public String getWifisig() {
        return wifisig;
    }

    public void setWifisig(String wifisig) {
        this.wifisig = wifisig;
    }
}
