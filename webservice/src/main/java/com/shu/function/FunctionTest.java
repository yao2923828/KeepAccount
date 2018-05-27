package com.shu.function;

import javax.jws.WebService;

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>版权: 税友软件集团股份有限公司</p> 
 * <p>创建时间: 2018/5/16 20:48</p> 
 * <p>作者：yaoq</p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 */
@WebService
public class FunctionTest{

    //该方法就是要暴露给其他应用程序调用的方法
    public String transWords(String words){
        String res="";
        for(char ch : words.toCharArray()){
            res+="\t"+ch+"\t";
        }

        return res;
    }


}
