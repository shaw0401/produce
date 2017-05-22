package com.produce.entity;

import java.util.Date;

public class Prplan {
    private String prplancode;

    private Date prplandate;

    private String operatorcode;

    private String seordercode;

    private String invencode;

    private String quantity;

    private Date finishdate;

    private String isflag;

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

    public String getPrplancode() {
        return prplancode;
    }

    public void setPrplancode(String prplancode) {
        this.prplancode = prplancode == null ? null : prplancode.trim();
    }

    public Date getPrplandate() {
        return prplandate;
    }

    public void setPrplandate(Date prplandate) {
        this.prplandate = prplandate;
    }

    public String getOperatorcode() {
        return operatorcode;
    }

    public void setOperatorcode(String operatorcode) {
        this.operatorcode = operatorcode == null ? null : operatorcode.trim();
    }

    public String getSeordercode() {
        return seordercode;
    }

    public void setSeordercode(String seordercode) {
        this.seordercode = seordercode == null ? null : seordercode.trim();
    }

    public String getInvencode() {
        return invencode;
    }

    public void setInvencode(String invencode) {
        this.invencode = invencode == null ? null : invencode.trim();
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity == null ? null : quantity.trim();
    }

    public Date getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }

    public String getIsflag() {
        return isflag;
    }

    public void setIsflag(String isflag) {
        this.isflag = isflag == null ? null : isflag.trim();
    }

    @Override
    public String toString() {
        return "Prplan{" +
                "prplancode='" + prplancode + '\'' +
                ", prplandate=" + prplandate +
                ", operatorcode='" + operatorcode + '\'' +
                ", seordercode='" + seordercode + '\'' +
                ", invencode='" + invencode + '\'' +
                ", quantity='" + quantity + '\'' +
                ", finishdate=" + finishdate +
                ", isflag='" + isflag + '\'' +
                '}';
    }
}