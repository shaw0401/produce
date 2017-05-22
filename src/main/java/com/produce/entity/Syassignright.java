package com.produce.entity;

public class Syassignright {
    private String operatorcode;

    private String operatorname;

    public String getOperatorcode() {
        return operatorcode;
    }

    public void setOperatorcode(String operatorcode) {
        this.operatorcode = operatorcode == null ? null : operatorcode.trim();
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname == null ? null : operatorname.trim();
    }

    @Override
    public String toString() {
        return "Syassignright{" +
                "operatorcode='" + operatorcode + '\'' +
                ", operatorname='" + operatorname + '\'' +
                '}';
    }
}