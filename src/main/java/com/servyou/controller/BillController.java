package com.servyou.controller;

import com.servyou.vo.ResultDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/addBill",method =RequestMethod.POST)
    public ResultDto addBill(@P) {
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
