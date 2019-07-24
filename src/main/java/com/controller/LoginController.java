package com.controller;

import com.vo.ResultDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
