package com.qhit.lh.gr3.asa.t4;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.tomcat.util.digester.FactoryCreateRule;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.gr3.asa.t4.bean.Dept;
import com.qhit.lh.gr3.asa.t4.bean.Emp;
import com.qhit.lh.gr3.asa.t4.bean.User;
import com.qhit.lh.gr3.asa.t4.service.BaseService;
import com.qhit.lh.gr3.asa.t4.service.Impl.BaseServiceImpl;
import com.qhit.lh.gr3.asa.t4.utils.HibernateSessionFactory;

public class EmpText {
	private BaseService bs = new BaseServiceImpl();

	@Test
	public void test() {
		// 添加员工
		Emp emp = new Emp();
		emp.setName("张");
		emp.setSex("女");
		emp.setBirthday("1998");

		// 添加账号
		User user = new User();
		user.setUname("uu");
		user.setPassword("123456");
		// 添加所属部门
		Dept dept = new Dept();
		dept = (Dept) bs.getObjectById(dept.getClass(), 1);
		// 一对一
		emp.setUser(user);
		user.setEmp(emp);
		// 一对多
		emp.setDept(dept);
		bs.add(emp);

	}

	@Test
	public void getEmpByName() {
		List<Emp> list = bs.getEmpByName("%张%");
		for (Emp emp : list) {
			System.out.println(emp.getEid() + ":" + emp.getName());
		}
	}

	/**
	 * 查询姓张的员工
	 */
	@Test
	public void getEmpLikeName() {
		// 获取session对象
		Session session = HibernateSessionFactory.getSession();
		// 通过sission对象创建criteria条件查询器
		Criteria criteria = session.createCriteria(Emp.class).add(
				Restrictions.like("sex", "男"));
		// 通过criteria条件查询器查询
		List<Emp> list = criteria.list();
		// 遍历输出
		for (Emp emp : list) {
			System.out.println(emp.getEid() + ":" + emp.getName());
		}
	}
	
	/**
	 * 投影查询
	 * 按员工姓名模糊查询，列出员工信息
	 */
	@Test
	public void getEmpInfo() {
		// 获取session对象
		Session session = HibernateSessionFactory.getSession();
		// 通过sission对象创建criteria条件查询器
		Criteria criteria = session.createCriteria(Emp.class).add(
				Restrictions.like("name", "李%"));
		
		ProjectionList pjl=Projections.projectionList()
				.add(Projections.property("name"))
				.add(Projections.property("sex"))
				.add(Projections.property("birthday"));
		// 通过criteria实例的setProjection（）方法将指定好的投影列表对象封装进来
		criteria.setProjection(pjl);
		
		// 遍历输出
		for (Object[] o : (List<Object[]>)criteria.list()) {
			System.out.println(o[0]+","+o[1]+","+o[2]);
		}
	}
	
	/**
	 * 连接查询
	 * 查询“国民党”的员工
	 */
	@Test
	public void getEmpByDept(){
		//获取session对象
		Session session=HibernateSessionFactory.getSession();
		//通过session对象创建Criteria条件查询器
		Criteria criteria=session.createCriteria(Emp.class)
				.setFetchMode("dept", FetchMode.JOIN)
				.createAlias("dept", "d")
				.add(Restrictions.eq("d.deptName", "国民党"));
		
		//通过criteria查询器进行查询
		List<Emp> list=criteria.list();
		
		for(Emp emp : list){
			System.out.println(emp.getEid()+":"+emp.getName());
		}
		
		
	}
	
	

}
