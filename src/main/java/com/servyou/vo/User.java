package com.servyou.vo;
/**
 * <p>标题：电子发票管理系统</p>
 * <p>描述：</p>
 * <p>版权：税友软件集团股份有限公司</p>
 * <p>创建时间：2016年10月24日</p>
 * <p>作者：姚强</p>
 */
public class User {
	private int userId;
	private String userName;
	private String password;
	private String sex;
	private String phone;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
