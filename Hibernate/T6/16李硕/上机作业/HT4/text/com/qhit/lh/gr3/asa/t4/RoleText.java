package com.qhit.lh.gr3.asa.t4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.asa.t4.bean.Role;
import com.qhit.lh.gr3.asa.t4.bean.User;
import com.qhit.lh.gr3.asa.t4.service.BaseService;
import com.qhit.lh.gr3.asa.t4.service.Impl.BaseServiceImpl;

public class RoleText {
   private BaseService bs=new BaseServiceImpl();
	/**
	 * 李硕
	 */
	@Test
	public void add() {
		//创建一个角色
	    Role role=new Role();
		role.setRname("主席");
		role.setMemo("党政军");
		
		//获取账户
		User user = (User) bs.getObjectById(User.class, 1002);
		
		//建立角色和账户的关系
		role.getUsers().add(user);
		
		bs.add(role);
		
		
		
	}
	@Test
	public void del() {
		Role role=(Role) bs.getObjectById(Role.class, 4);
		bs.delete(role);
	}
	@Test
	public void update() {
		Role role=(Role) bs.getObjectById(Role.class, 3);
		role.setRname("主席");
		role.setMemo("军");
		bs.update(role);
	}
	@Test
	public void query() {
		Role role=(Role) bs.getObjectById(Role.class, 3);
		
		for(User user:role.getUsers()){
			System.out.println(role.getRname()+":"+user.getUname());
		}
	}

}
