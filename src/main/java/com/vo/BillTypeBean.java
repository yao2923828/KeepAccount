package com.vo;

import java.io.Serializable;


public class BillTypeBean implements Serializable {
    private String id;
    private String name;
    private String rsid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRsid() {
        return rsid;
    }

    public void setRsid(String rsid) {
        this.rsid = rsid;
    }
}
