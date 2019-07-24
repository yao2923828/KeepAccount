package com.vo;

import java.io.Serializable;

public class UserBean implements Serializable {
    private String username;
    private String password;
    private String name;
    private String icon;
    private String phone;
    private String totalout;
    private String date;
    private String budget;
    private String calDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTotalout() {
        return totalout;
    }

    public void setTotalout(String totalout) {
        this.totalout = totalout;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getCalDate() {
        return calDate;
    }

    public void setCalDate(String calDate) {
        this.calDate = calDate;
    }
}
