package com.asa.t1;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {
	private String username;
	private String password;
	@Override
	public String execute() throws Exception {
		
		// TODO Auto-generated method stub
		if(username.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("123456")){
			return SUCCESS;
		}else
		return ERROR;
	}
	public LoginAction(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public LoginAction() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}

