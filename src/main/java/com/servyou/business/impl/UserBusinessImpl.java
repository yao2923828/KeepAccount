package com.servyou.business.impl;

import com.servyou.business.IUserBusiness;
import com.servyou.dao.IUserDao;
import com.servyou.vo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>标题：电子发票管理系统</p>
 * <p>描述：</p>
 * <p>版权：税友软件集团股份有限公司</p>
 * <p>创建时间：2016年10月24日</p>
 * <p>作者：姚强</p>
 */
@Service
public class UserBusinessImpl implements IUserBusiness{
	@Resource
	private IUserDao userDao;
	public boolean addUser(User u) {
		return userDao.addUser(u)>0;
	}

	public boolean deleteUser(int id) {
		return userDao.deleteUser(id)>0;
	}

	public boolean updateUser(User u) {
		return userDao.updateUser(u)>0;
	}

	public List<User> queryUser() {
		return userDao.queryUser();
	}

	public User queryUserById(int id) {
		return userDao.queryUserById(id);
	}

}
