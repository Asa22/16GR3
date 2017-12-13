package com.qhit.lh.gr3.asa.t1.bean;

/**
 * @author 李硕
 * TODO
 * 2017年12月12日上午11:16:16
 */
public class User {
	private int id;
	private String name;
	private String password;
	private String birthday;
	private String sex;
	private int enable;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getEnable() {
		return enable;
	}
	public void setEnable(int enable) {
		this.enable = enable;
	}
	public User(int id, String name, String password, String birthday,
			String sex, int enable) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.birthday = birthday;
		this.sex = sex;
		this.enable = enable;
	}
	public User() {
		super();
	}
	
	
	
	

}
