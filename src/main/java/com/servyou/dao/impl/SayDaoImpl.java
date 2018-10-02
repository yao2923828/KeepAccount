package com.servyou.dao.impl;

import org.springframework.stereotype.Repository;

import com.servyou.dao.ISayDao;

/**
 * <p>标题：电子发票管理系统</p>
 * <p>描述：</p>
 * <p>版权：税友软件集团股份有限公司</p>
 * <p>创建时间：2016年10月11日</p>
 * <p>作者：姚强</p>
 */
@Repository
public class SayDaoImpl implements ISayDao{

	public void say() {
		System.out.println("hello");
	}
	
}
