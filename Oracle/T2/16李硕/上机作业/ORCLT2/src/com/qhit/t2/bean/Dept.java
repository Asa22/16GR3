package com.qhit.t2.bean;

public class Dept {

	
	private int did ;
	private String dname;
	private int manager;
	private String tel;
	private int master;
	public Dept(int did, String dname, int manager, String tel, int master) {
		super();
		this.did = did;
		this.dname = dname;
		this.manager = manager;
		this.tel = tel;
		this.master = master;
	}
	public Dept() {
		super();
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getManager() {
		return manager;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getMaster() {
		return master;
	}
	public void setMaster(int master) {
		this.master = master;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + ", manager=" + manager + ", tel=" + tel + ", master=" + master
				+ "]";
	}
	
	

}
