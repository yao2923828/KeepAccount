package com.util;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;


public class JsonUtils {
    public static Map getMapForJson(String jsonString){
        return JSONObject.parseObject(jsonString);
    }
}
