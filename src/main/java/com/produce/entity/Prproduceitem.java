package com.produce.entity;

public class Prproduceitem {
    private Integer id;

    private String prproducecode;

    private String invencode;

    private Integer quantity;

    private Integer getquantity;

    private Integer usequantity;

    private Bsinven bsinven;

    public Bsinven getBsinven() {
        return bsinven;
    }

    public void setBsinven(Bsinven bsinven) {
        this.bsinven = bsinven;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrproducecode() {
        return prproducecode;
    }

    public void setPrproducecode(String prproducecode) {
        this.prproducecode = prproducecode == null ? null : prproducecode.trim();
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

    public Integer getGetquantity() {
        return getquantity;
    }

    public void setGetquantity(Integer getquantity) {
        this.getquantity = getquantity;
    }

    public Integer getUsequantity() {
        return usequantity;
    }

    public void setUsequantity(Integer usequantity) {
        this.usequantity = usequantity;
    }

    @Override
    public String toString() {
        return "Prproduceitem{" +
                "id=" + id +
                ", prproducecode='" + prproducecode + '\'' +
                ", invencode='" + invencode + '\'' +
                ", quantity=" + quantity +
                ", getquantity=" + getquantity +
                ", usequantity=" + usequantity +
                '}';
    }
}