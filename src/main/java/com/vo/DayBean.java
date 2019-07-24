package com.vo;

import java.io.Serializable;
import java.util.List;


public class DayBean implements Serializable {
    private String id;
    private String date;
    private String total;
    private String outTotal;
    private String shorts;
    private List<BillBean> resumeBeans;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getOutTotal() {
        return outTotal;
    }

    public void setOutTotal(String outTotal) {
        this.outTotal = outTotal;
    }

    public String getShorts() {
        return shorts;
    }

    public void setShorts(String shorts) {
        this.shorts = shorts;
    }

    public List<BillBean> getResumeBeans() {
        return resumeBeans;
    }

    public void setResumeBeans(List<BillBean> resumeBeans) {
        this.resumeBeans = resumeBeans;
    }
}
