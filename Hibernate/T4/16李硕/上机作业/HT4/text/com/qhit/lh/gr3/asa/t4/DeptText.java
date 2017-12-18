package com.qhit.lh.gr3.asa.t4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.asa.t4.bean.Dept;
import com.qhit.lh.gr3.asa.t4.bean.Emp;
import com.qhit.lh.gr3.asa.t4.bean.User;
import com.qhit.lh.gr3.asa.t4.service.BaseService;
import com.qhit.lh.gr3.asa.t4.service.Impl.BaseServiceImpl;

public class DeptText {
  private BaseService bs=new BaseServiceImpl();
	@Test
	public void add() {
      //添加部门
		Dept dept=new Dept();
		dept.setDeptName("反对党");
		dept.setAddress("香港");
		
		//有员工
		Emp emp= new Emp();
		emp.setName("达赖");
		emp.setSex("？");
		emp.setBirthday("1944-4-4");
		
		dept.getEmps().add(emp);
		
		bs.add(dept);
		
	}
	@Test
	public void delete() {
		Dept dept=(Dept)bs.getObjectById(Dept.class,2);
		
		bs.delete(dept);
		
	}
	
	@Test
	public void update() {
		Dept dept=(Dept)bs.getObjectById(Dept.class,1);
		dept.setDeptName("电台");
		
		bs.update(dept);
		
	}

}
