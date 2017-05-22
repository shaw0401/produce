package com.produce.entity;

public class Bsinven {
    private String invencode;

    private String invenname;

    public String getInvencode() {
        return invencode;
    }

    public void setInvencode(String invencode) {
        this.invencode = invencode == null ? null : invencode.trim();
    }

    public String getInvenname() {
        return invenname;
    }

    public void setInvenname(String invenname) {
        this.invenname = invenname == null ? null : invenname.trim();
    }
}