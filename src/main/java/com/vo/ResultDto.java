package com.vo;

import java.util.Map;


public class ResultDto {
    private boolean success;
    private String message;
    private Object value;
    private String msgCode;
    private Map resultMap;
    private String jylsh;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public Map getResultMap() {
        return resultMap;
    }

    public void setResultMap(Map resultMap) {
        this.resultMap = resultMap;
    }

    public String getJylsh() {
        return jylsh;
    }

    public void setJylsh(String jylsh) {
        this.jylsh = jylsh;
    }
    public static ResultDto  createSuccess(Object value){
        ResultDto resultDto=new ResultDto();
        resultDto.setSuccess(true);
        resultDto.setValue(value);
        return resultDto;
    }
    public static ResultDto  createSuccess(){
        ResultDto resultDto=new ResultDto();
        resultDto.setSuccess(true);
        return resultDto;
    }
}
