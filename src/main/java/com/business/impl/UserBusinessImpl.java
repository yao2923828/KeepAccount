package com.business.impl;

import com.business.IUserBusiness;
import com.dao.IUserDao;
import com.vo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserBusinessImpl implements IUserBusiness {
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
