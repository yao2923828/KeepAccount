package com.servyou.controller;

import com.servyou.vo.ResultDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>版权: 税友软件集团股份有限公司</p> 
 * <p>创建时间: 2018/10/2 21:23</p> 
 * <p>作者：yaoq</p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 */
@RestController("/login")
public class LoginController {

    @RequestMapping("/login")
    public ResultDto login() {
        return ResultDto.createSuccess();
    }
    @RequestMapping("/register")
    public ResultDto register() {
        return ResultDto.createSuccess();
    }
    @RequestMapping("/logout")
    public ResultDto Logout() {
        return ResultDto.createSuccess();
    }
}
