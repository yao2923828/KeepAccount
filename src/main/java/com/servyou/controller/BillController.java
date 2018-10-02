package com.servyou.controller;

import com.servyou.vo.ResultDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>版权: 税友软件集团股份有限公司</p> 
 * <p>创建时间: 2018/10/2 21:34</p> 
 * <p>作者：yaoq</p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 */
@RestController("/bill")
public class BillController {

    @RequestMapping("/addBill")
    public ResultDto addBill() {
        return ResultDto.createSuccess();
    }
    @RequestMapping("/deleteBill")
    public ResultDto deleteBill() {
        return ResultDto.createSuccess();
    }
    @RequestMapping("/editBill")
    public ResultDto editBill() {
        return ResultDto.createSuccess();
    }
    @RequestMapping("/queryDailyBills")
    public ResultDto queryDailyBills() {
        return ResultDto.createSuccess();
    }
    @RequestMapping("/queryMonthBill")
    public ResultDto queryMonthBill() {
        return ResultDto.createSuccess();
    }
    @RequestMapping("/queryLastSevenDaysBills")
    public ResultDto queryLastSevenDaysBills() {
        return ResultDto.createSuccess();
    }
    @RequestMapping("/setCalDate")
    public ResultDto setCalDate() {
        return ResultDto.createSuccess();
    }
    @RequestMapping("/addBillTemplat")
    public ResultDto addBillTemplat() {
        return ResultDto.createSuccess();
    }
    @RequestMapping("/deleteBillTemplat")
    public ResultDto deleteBillTemplat() {
        return ResultDto.createSuccess();
    }
    @RequestMapping("/editBillTemplat")
    public ResultDto editBillTemplat() {
        return ResultDto.createSuccess();
    }
    @RequestMapping("/queryBillTemplat")
    public ResultDto queryBillTemplat() {
        return ResultDto.createSuccess();
    }
}
