package com.qhit.lh.gr3.asa.t3;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.gr3.asa.t3.bean.Dept;
import com.qhit.lh.gr3.asa.t3.bean.Emp;
import com.qhit.lh.gr3.asa.t3.bean.User;
import com.qhit.lh.gr3.asa.t3.servcie.BaseService;
import com.qhit.lh.gr3.asa.t3.servcie.impl.BaseServiceImpl;

public class DeptText {
  private BaseService baseService =new BaseServiceImpl();
	@Test
	public void add() {
		Emp emp =new Emp();
		emp.setName("李硕");
		emp.setSex("男");
		emp.setBirthday("1998-02-09");
		
		User user=new User();
		user.setUname("admin");
		user.setPassword("123456");
		
		Dept dept=new Dept();
		dept=(Dept) baseService.getObjectById(Dept.class, 1);
		
		emp.setDept(dept);
		emp.setUser(user);
		user.setEmp(emp);
		
		baseService.add(emp);
	}
	
	/*
	 * 删
	 */
	@Test
	public void del() {
		Emp emp = new Emp();
		emp = (Emp) baseService.getObjectById(Emp.class,1002);
		baseService.delete(emp);
	}
	
	/*
	 * 改
	 */
	@Test
	public void upd(){
		Emp emp =new Emp();
		emp=(Emp) baseService.getObjectById(Emp.class, 1001);
		emp.setName("李石");
		
		User user=new User();
		user=emp.getUser();
		user.setUname("yyyyy");
		user.setPassword("123456");
		
		Dept dept=new Dept();
		dept=emp.getDept();
		dept.setDeptId(2);
		
		emp.setDept(dept);
		emp.setUser(user);
		user.setEmp(emp);
		baseService.update(emp);
	}
	
	/*
	 * 查
	 */
	@Test
	public void get() {
		List<Object> list = baseService.getAll("from Emp");
		
		for (Object object : list) {
			Emp emp = (Emp) object;
			System.out.println(list.size());
			System.out.println(emp.toString());
		}
	}

}
