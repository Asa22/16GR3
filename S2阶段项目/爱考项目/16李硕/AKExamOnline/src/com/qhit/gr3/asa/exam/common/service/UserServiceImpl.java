package com.qhit.gr3.asa.exam.common.service;

import com.qhit.gr3.asa.exam.common.bean.User;
import com.qhit.gr3.asa.exam.common.dao.UserDao;
import com.qhit.gr3.asa.exam.common.dao.UserDaoImpl;

/**
 * @author 李硕
 *
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

}
