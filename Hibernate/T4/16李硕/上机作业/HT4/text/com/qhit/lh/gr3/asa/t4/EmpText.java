package com.qhit.lh.gr3.asa.t4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.asa.t4.bean.Dept;
import com.qhit.lh.gr3.asa.t4.bean.Emp;
import com.qhit.lh.gr3.asa.t4.bean.User;
import com.qhit.lh.gr3.asa.t4.service.BaseService;
import com.qhit.lh.gr3.asa.t4.service.Impl.BaseServiceImpl;

public class EmpText {
	  private BaseService bs=new BaseServiceImpl();
	@Test
	public void test() {
		 //添加员工
		Emp emp=new Emp();
		emp.setName("张伟");
		emp.setSex("男");
		emp.setBirthday("1998-01-01");
		
		//添加账号
		User user = new User();
		user.setUname("zh");
		user.setPassword("123456");
		//添加所属部门
		Dept dept = new Dept();
		dept = (Dept) bs.getObjectById(dept.getClass(), 1);
		//一对一
		emp.setUser(user);
		user.setEmp(emp);
		//一对多
		emp.setDept(dept);
		bs.add(emp);
	
	}

}
