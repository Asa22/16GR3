package com.qhit.lh.gr3.asa.t3.bean;



/**
 * @author 李硕
 * TODO
 * 2017年12月14日下午8:28:53
 */
public class Emp implements java.io.Serializable {

	// Fields

	private Integer eid;
	private String name;
	private String sex;
	private String birthday;
	private Integer deptId;
	
	    //一对一
		/**
		 * 
		 */
		private User user;
		//多对一
		private Dept dept;

	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** full constructor */
	public Emp(String name, String sex, String birthday, Integer deptId) {
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.deptId = deptId;
	}

	// Property accessors

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", sex=" + sex + ", birthday=" + birthday + ", deptId=" + deptId
				+ ", user=" + user + ", dept=" + dept + "]";
	}

	

}