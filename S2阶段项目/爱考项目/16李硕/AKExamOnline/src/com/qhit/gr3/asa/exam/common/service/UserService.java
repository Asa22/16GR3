package com.qhit.gr3.asa.exam.common.service;

import com.qhit.gr3.asa.exam.common.bean.User;

/**
 * @author 李硕
 *
 */
public interface UserService {
	
	/**
	 * @param d登录
	 * @return
	 */
	public User login(User user);

}
