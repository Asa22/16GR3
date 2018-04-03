package com.qhit.gr3.asa.exam;

import static org.junit.Assert.*;

import org.hibernate.Transaction;
import org.junit.Test;

import com.qhit.gr3.asa.exam.common.bean.Student;
import com.qhit.gr3.asa.exam.common.bean.User;
import com.qhit.gr3.asa.exam.common.dao.BaseDao;

public class StuText extends BaseDao{

	@Test
	public void test() {
		//新建学生
				Student student = new Student();
				student.setSname("李硕");
				student.setSex("男");
				student.setEnterSchool("2016");
				student.setCcode("");
				//分配账户
				User user = new User();
				user.setName("16030323016");
				user.setPwd("123456");
				user.setRole(1);
				
				student.setUser(user);
				
				Transaction ts = getSession().beginTransaction();
				getSession().save(student);
				ts.commit();
	}

}
