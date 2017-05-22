package com.produce.entity;

import java.util.Date;

public class Prproduce {
    private String prproducecode;

    private Date prproducedate;

    private String operatorcode;

    private String prplancode;

    private String departmentcode;

    private String invencode;

    private Integer quantity;

    private Date startdate;

    private Date enddate;

    private String isflag;

    private String iscomplete;

    private Syassignright syassignright;

    private Bsinven bsinven;

    public Bsinven getBsinven() {
        return bsinven;
    }

    public void setBsinven(Bsinven bsinven) {
        this.bsinven = bsinven;
    }

    public Syassignright getSyassignright() {
        return syassignright;
    }

    public void setSyassignright(Syassignright syassignright) {
        this.syassignright = syassignright;
    }

    public String getPrproducecode() {
        return prproducecode;
    }

    public void setPrproducecode(String prproducecode) {
        this.prproducecode = prproducecode == null ? null : prproducecode.trim();
    }

    public Date getPrproducedate() {
        return prproducedate;
    }

    public void setPrproducedate(Date prproducedate) {
        this.prproducedate = prproducedate;
    }

    public String getOperatorcode() {
        return operatorcode;
    }

    public void setOperatorcode(String operatorcode) {
        this.operatorcode = operatorcode == null ? null : operatorcode.trim();
    }

    public String getPrplancode() {
        return prplancode;
    }

    public void setPrplancode(String prplancode) {
        this.prplancode = prplancode == null ? null : prplancode.trim();
    }

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode == null ? null : departmentcode.trim();
    }

    public String getInvencode() {
        return invencode;
    }

    public void setInvencode(String invencode) {
        this.invencode = invencode == null ? null : invencode.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getIsflag() {
        return isflag;
    }

    public void setIsflag(String isflag) {
        this.isflag = isflag == null ? null : isflag.trim();
    }

    public String getIscomplete() {
        return iscomplete;
    }

    public void setIscomplete(String iscomplete) {
        this.iscomplete = iscomplete == null ? null : iscomplete.trim();
    }

    @Override
    public String toString() {
        return "Prproduce{" +
                "prproducecode='" + prproducecode + '\'' +
                ", prproducedate=" + prproducedate +
                ", operatorcode='" + operatorcode + '\'' +
                ", prplancode='" + prplancode + '\'' +
                ", departmentcode='" + departmentcode + '\'' +
                ", invencode='" + invencode + '\'' +
                ", quantity=" + quantity +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", isflag='" + isflag + '\'' +
                ", iscomplete='" + iscomplete + '\'' +
                ", syassignright=" + syassignright +
                '}';
    }
}