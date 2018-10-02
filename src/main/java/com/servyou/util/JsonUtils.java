package com.servyou.util;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>版权: 税友软件集团股份有限公司</p> 
 * <p>创建时间: 2018/10/3 6:29</p> 
 * <p>作者：yaoq</p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 */
public class JsonUtils {
    public static Map getMapForJson(String jsonString){
        return JSONObject.parseObject(jsonString);
    }
}
