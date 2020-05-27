package com.battle.panda.caipiao.model;

public class CaiPiaoNumberDate {
    private String date;

    private String first;

    private String sec;

    private String third;

    private String forth;

    private String fiveth;

    private String sumnumber;

    private String kuadu;

    private String describes;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first == null ? null : first.trim();
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec == null ? null : sec.trim();
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third == null ? null : third.trim();
    }

    public String getForth() {
        return forth;
    }

    public void setForth(String forth) {
        this.forth = forth == null ? null : forth.trim();
    }

    public String getFiveth() {
        return fiveth;
    }

    public void setFiveth(String fiveth) {
        this.fiveth = fiveth == null ? null : fiveth.trim();
    }

    public String getSumnumber() {
        return sumnumber;
    }

    public void setSumnumber(String sumnumber) {
        this.sumnumber = sumnumber == null ? null : sumnumber.trim();
    }

    public String getKuadu() {
        return kuadu;
    }

    public void setKuadu(String kuadu) {
        this.kuadu = kuadu == null ? null : kuadu.trim();
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes == null ? null : describes.trim();
    }

}