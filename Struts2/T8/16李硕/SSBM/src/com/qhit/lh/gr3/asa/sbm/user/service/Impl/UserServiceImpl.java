package com.qhit.lh.gr3.asa.sbm.user.service.Impl;

import java.sql.SQLException;
import java.util.List;

import com.qhit.lh.gr3.asa.sbm.user.bean.User;
import com.qhit.lh.gr3.asa.sbm.user.dao.UserDao;
import com.qhit.lh.gr3.asa.sbm.user.dao.Impl.UserDaoImpl;
import com.qhit.lh.gr3.asa.sbm.user.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao= new UserDaoImpl();

	@Override
	public List<User> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public User dologin(String userName, String password) {
		// TODO Auto-generated method stub
		return userDao.doLogin(userName,password);
	}

}
