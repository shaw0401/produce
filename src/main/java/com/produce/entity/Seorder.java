package com.produce.entity;

import java.util.Date;

public class Seorder {
    private String seordercode;

    private Date seorderdate;

    public String getSeordercode() {
        return seordercode;
    }

    public void setSeordercode(String seordercode) {
        this.seordercode = seordercode == null ? null : seordercode.trim();
    }

    public Date getSeorderdate() {
        return seorderdate;
    }

    public void setSeorderdate(Date seorderdate) {
        this.seorderdate = seorderdate;
    }
}