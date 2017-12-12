package com.qhit.lh.gr3.asa.t1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.asa.t1.bean.User;
import com.qhit.lh.gr3.asa.t1.service.BaseService;
import com.qhit.lh.gr3.asa.t1.service.Impl.BaseServiceImpl;

/**
 * @author 李硕
 * TODO
 * 2017年12月12日上午11:16:50
 */
public class UserText {
     private BaseService baseService = new BaseServiceImpl();
	@Test
	public void addUser(){
		 //声明实例化对象
		User user = new User();
		user.setName("jsj");
		user.setPassword("123456");
		user.setBirthday("1998-09-09");
		user.setSex("女");
		user.setEnable(1);
		//数据操作
		baseService.add(user);
	}

}
