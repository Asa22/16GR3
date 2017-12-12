package com.qhit.lh.gr3.asa.sbm.user.dao;

import java.sql.SQLException;
import java.util.List;

import com.qhit.lh.gr3.asa.sbm.user.bean.User;

public interface UserDao {
	/**
	 * @return
	 * 查询所有的用户
	 * @throws SQLException 
	 * @throws Exception 
	 */

	public List<User> getAll() throws SQLException;
	
	/**
	 * @param user
	 * @return
	 * 添加用户
	 */
	public int addUser(User user);
	/**
	 * @param userName
	 * @param userPassword
	 * @return
	 * 登陆的数据访问
	 */
	public User doLogin(String userName, String userPassword);
	
	

}
