package com.servyou.dao;

import java.util.List;

import com.servyou.vo.User;

/**
 * <p>标题：电子发票管理系统</p>
 * <p>描述：</p>
 * <p>版权：税友软件集团股份有限公司</p>
 * <p>创建时间：2016年10月24日</p>
 * <p>作者：姚强</p>
 */
public interface IUserDao {
	int addUser(User u);
	int deleteUser(int id);
	int updateUser(User u);
	List<User> queryUser();
	User queryUserById(int id);
}
