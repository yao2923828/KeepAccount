package com.vo;

import java.io.Serializable;


public class BillBean implements Serializable {
    private String id;
    private String amout;
    private String date;
    private String role;
    private String desc;
    private BillTypeBean billTypeBean;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmout() {
        return amout;
    }

    public void setAmout(String amout) {
        this.amout = amout;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BillTypeBean getBillTypeBean() {
        return billTypeBean;
    }

    public void setBillTypeBean(BillTypeBean billTypeBean) {
        this.billTypeBean = billTypeBean;
    }
}
