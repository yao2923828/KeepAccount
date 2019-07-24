package com.business;

import com.vo.User;

import java.util.List;


public interface IUserBusiness {
	boolean addUser(User u);
	boolean deleteUser(int id);
	boolean updateUser(User u);
	List<User> queryUser();
	User queryUserById(int id);
}
