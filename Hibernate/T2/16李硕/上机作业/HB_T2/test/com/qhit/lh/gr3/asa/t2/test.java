package com.qhit.lh.gr3.asa.t2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.asa.t2.bean.Emp;
import com.qhit.lh.gr3.asa.t2.bean.User;
import com.qhit.lh.gr3.asa.t2.servcie.BaseService;
import com.qhit.lh.gr3.asa.t2.servcie.impl.BaseServiceImpl;


public class test {
	 private BaseService baseService=new BaseServiceImpl();
	@Test
	public void add() {
		Emp emp=new Emp();
		emp.setName("tomcat");
		emp.setSex("男");
		emp.setBirthday("1998-02-09");
		emp.setDeptId(1);
		//分配一个账户
		User user= new User();
		user.setUname("tomgdsjagjd");
		user.setPassword("123456");
		//建立一对一关系
		emp.setUser(user);//指定当前员工的账户
		user.setEmp(emp);//制定当前用户所属的员工
		
		//连级操作
		baseService.add(emp);
	}

}
