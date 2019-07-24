package com.controller;

import com.vo.BillBean;
import com.vo.ResultDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController("/bill")
public class BillController {

    @RequestMapping(value = "/addBill",method =RequestMethod.POST)
    public ResultDto addBill(@RequestBody BillBean Bill) {
        return ResultDto.createSuccess();
    }
    @RequestMapping(value="/deleteBill",method =RequestMethod.POST)
    public ResultDto deleteBill() {
        return ResultDto.createSuccess();
    }
    @RequestMapping(value="/editBill")
    public ResultDto editBill() {
        return ResultDto.createSuccess();
    }
    @RequestMapping(value="/queryDailyBills")
    public ResultDto queryDailyBills() {
        return ResultDto.createSuccess();
    }
    @RequestMapping(value="/queryMonthBill")
    public ResultDto queryMonthBill() {
        return ResultDto.createSuccess();
    }
    @RequestMapping(value="/queryLastSevenDaysBills")
    public ResultDto queryLastSevenDaysBills() {
        return ResultDto.createSuccess();
    }
    @RequestMapping(value="/setCalDate")
    public ResultDto setCalDate() {
        return ResultDto.createSuccess();
    }
    @RequestMapping(value="/addBillTemplat")
    public ResultDto addBillTemplat() {
        return ResultDto.createSuccess();
    }
    @RequestMapping(value="/deleteBillTemplat")
    public ResultDto deleteBillTemplat() {
        return ResultDto.createSuccess();
    }
    @RequestMapping(value="/editBillTemplat")
    public ResultDto editBillTemplat() {
        return ResultDto.createSuccess();
    }
    @RequestMapping(value="/queryBillTemplat")
    public ResultDto queryBillTemplat() {
        return ResultDto.createSuccess();
    }
}
