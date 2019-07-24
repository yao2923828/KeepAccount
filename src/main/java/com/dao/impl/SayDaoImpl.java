package com.dao.impl;

import com.dao.ISayDao;
import org.springframework.stereotype.Repository;


@Repository
public class SayDaoImpl implements ISayDao {

	public void say() {
		System.out.println("hello");
	}
	
}
