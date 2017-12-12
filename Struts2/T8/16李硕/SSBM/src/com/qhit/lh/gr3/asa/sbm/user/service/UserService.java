package com.qhit.lh.gr3.asa.sbm.user.service;

import java.sql.SQLException;
import java.util.List;

import com.qhit.lh.gr3.asa.sbm.user.bean.User;

/**
 * @author 李硕
 * TODO
 * 2017年12月10日下午8:21:23
 */
public interface UserService {
	
	/**
	 * 查询所有的用户
	 * @return
	 * @throws SQLException 
	 */
	public List<User> getAll() throws SQLException;
	
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public int addUser(User user);
	
	/**
	 * 登陆的业务
	 * @param userName
	 * @param password
	 * @return
	 */
	public User dologin(String userName,String password);

}
