package com.qhit.gr3.asa.exam.common.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.gr3.asa.exam.common.bean.User;
import com.qhit.gr3.asa.exam.common.service.UserService;
import com.qhit.gr3.asa.exam.common.service.UserServiceImpl;

public class UserAction extends ActionSupport {
	private UserService userService = new UserServiceImpl();
	
	private User user;
	
	/**
	 * @return
	 * 登录的业务处理方法
	 */
	public String login(){
		
		user = userService.login(user);
		if(user != null){
			//登录成功,存储user对象到session中
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
			return "loginSuccess";
		}else{
			super.addActionError("登录失败！请重新登录!");
			return "loginFail";
		}
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
