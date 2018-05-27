package com.shu.function;

import javax.xml.ws.Endpoint;

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>版权: 税友软件集团股份有限公司</p> 
 * <p>创建时间: 2018/5/16 20:50</p> 
 * <p>作者：yaoq</p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 */
public class TestMain {
    //这里我们使用main方法来发布我们的service
    public static void main(String[] args){
        Endpoint.publish("http://localhost:9001/Service/Function",new FunctionTest());
        System.out.println("Publish Success~");
    }
}
