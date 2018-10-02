package com.servyou.vo;

import java.util.Map;

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>版权: 税友软件集团股份有限公司</p> 
 * <p>创建时间: 2018/10/2 21:25</p> 
 * <p>作者：yaoq</p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 */
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
