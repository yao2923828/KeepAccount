package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.business.IUserBusiness;
import com.vo.User;
@Controller
public class HelloWorldController{
	@Resource
	IUserBusiness userBusiness;
	
	@RequestMapping("/add")
	public void addUser() {
		User u=new User();
		u.setUserName("123");
		u.setPassword("ddd");
		u.setPhone("ddd");
		u.setSex("男");
		if(userBusiness.addUser(u)){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
	}
	@RequestMapping("/update")
	public void updateUser() {
		User u=userBusiness.queryUserById(0);
		if(userBusiness.updateUser(u)){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
	}
	@RequestMapping("/delete")
	public void deleteUser() {
		if(userBusiness.deleteUser(9)){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
	}
	@RequestMapping("/query")
	public void queryUser() {
		System.out.println(userBusiness.queryUser().size());
	}
}