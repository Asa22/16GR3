package com.qhit.lh.gr3.asa.t3.bean;



/**
 * @author 李硕
 * TODO
 * 2017年12月14日下午8:29:09
 */
public class User implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String uname;
	private String password;
	
	//一对一
		private Emp emp;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String uname, String password) {
		this.uname = uname;
		this.password = password;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

}