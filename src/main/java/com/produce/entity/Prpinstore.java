package com.produce.entity;

import java.util.Date;

public class Prpinstore {
    private String princode;

    private Date prindate;

    private String operatorcode;

    private String prproducecode;

    private String storecode;

    private String invencode;

    private String prquantity;

    private String inquantity;

    private String employeecode;

    private String isflag;

    private Syassignright syassignright;

    private Bsinven bsinven;

    public Syassignright getSyassignright() {
        return syassignright;
    }

    public void setSyassignright(Syassignright syassignright) {
        this.syassignright = syassignright;
    }

    public Bsinven getBsinven() {
        return bsinven;
    }

    public void setBsinven(Bsinven bsinven) {
        this.bsinven = bsinven;
    }

    public String getPrincode() {
        return princode;
    }

    public void setPrincode(String princode) {
        this.princode = princode == null ? null : princode.trim();
    }

    public Date getPrindate() {
        return prindate;
    }

    public void setPrindate(Date prindate) {
        this.prindate = prindate;
    }

    public String getOperatorcode() {
        return operatorcode;
    }

    public void setOperatorcode(String operatorcode) {
        this.operatorcode = operatorcode == null ? null : operatorcode.trim();
    }

    public String getPrproducecode() {
        return prproducecode;
    }

    public void setPrproducecode(String prproducecode) {
        this.prproducecode = prproducecode == null ? null : prproducecode.trim();
    }

    public String getStorecode() {
        return storecode;
    }

    public void setStorecode(String storecode) {
        this.storecode = storecode == null ? null : storecode.trim();
    }

    public String getInvencode() {
        return invencode;
    }

    public void setInvencode(String invencode) {
        this.invencode = invencode == null ? null : invencode.trim();
    }

    public String getPrquantity() {
        return prquantity;
    }

    public void setPrquantity(String prquantity) {
        this.prquantity = prquantity == null ? null : prquantity.trim();
    }

    public String getInquantity() {
        return inquantity;
    }

    public void setInquantity(String inquantity) {
        this.inquantity = inquantity == null ? null : inquantity.trim();
    }

    public String getEmployeecode() {
        return employeecode;
    }

    public void setEmployeecode(String employeecode) {
        this.employeecode = employeecode == null ? null : employeecode.trim();
    }

    public String getIsflag() {
        return isflag;
    }

    public void setIsflag(String isflag) {
        this.isflag = isflag == null ? null : isflag.trim();
    }

    @Override
    public String toString() {
        return "Prpinstore{" +
                "princode='" + princode + '\'' +
                ", prindate=" + prindate +
                ", operatorcode='" + operatorcode + '\'' +
                ", prproducecode='" + prproducecode + '\'' +
                ", storecode='" + storecode + '\'' +
                ", invencode='" + invencode + '\'' +
                ", prquantity='" + prquantity + '\'' +
                ", inquantity='" + inquantity + '\'' +
                ", employeecode='" + employeecode + '\'' +
                ", isflag='" + isflag + '\'' +
                ", syassignright=" + syassignright +
                ", bsinven=" + bsinven +
                '}';
    }
}