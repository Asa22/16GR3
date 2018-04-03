package com.qhit.gr3.asa.exam;

import static org.junit.Assert.*;

import org.hibernate.Transaction;
import org.junit.Test;

import com.qhit.gr3.asa.exam.common.bean.Teacher;
import com.qhit.gr3.asa.exam.common.bean.User;
import com.qhit.gr3.asa.exam.common.dao.BaseDao;

public class TeacherText extends BaseDao{

	@Test
	public void test() {
		Teacher tea=new Teacher();
		tea.setTname("刘倩");
		tea.setSex("女");
		tea.setPost("辅导员");
		
		User user =new User();
		user.setName("liu");
		user.setPwd("123456");
		user.setRole(2);
		
		tea.setUser(user);
		
		Transaction ts= getSession().beginTransaction();
		getSession().save(tea);
		ts.commit();
	}

}
