package com.dao;

import com.vo.User;

import java.util.List;


public interface IUserDao {
	int addUser(User u);
	int deleteUser(int id);
	int updateUser(User u);
	List<User> queryUser();
	User queryUserById(int id);
}
