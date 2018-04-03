package com.qhit.gr3.asa.exam;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.gr3.asa.exam.common.action.UserAction;
import com.qhit.gr3.asa.exam.common.bean.Student;
import com.qhit.gr3.asa.exam.common.bean.Teacher;
import com.qhit.gr3.asa.exam.common.bean.User;
import com.qhit.gr3.asa.exam.common.service.UserService;
import com.qhit.gr3.asa.exam.common.service.UserServiceImpl;

public class UserText {
private UserService us=new UserServiceImpl();
	@Test
	public void login() {
		
		User user= new User();
		user.setName("ls");
		user.setPwd("123456");
		user.setRole(1);
		Teacher tea=new Teacher();
		
		tea.setUser(user);
		Student stu=new Student();
		
		stu.setUser(user);
		
	}

}
