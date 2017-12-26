package com.qhit.lh.gr3.asa.t4;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.junit.Test;

import com.qhit.lh.gr3.asa.t4.bean.Dept;
import com.qhit.lh.gr3.asa.t4.bean.Emp;
import com.qhit.lh.gr3.asa.t4.bean.User;
import com.qhit.lh.gr3.asa.t4.service.BaseService;
import com.qhit.lh.gr3.asa.t4.service.Impl.BaseServiceImpl;
import com.qhit.lh.gr3.asa.t4.utils.HibernateSessionFactory;

public class DeptText {
	private BaseService bs = new BaseServiceImpl();

	@Test
	public void add() {
		// 添加部门
		Dept dept = new Dept();
		dept.setDeptName("反对党");
		dept.setAddress("香港");

		// 有员工
		Emp emp = new Emp();
		emp.setName("达赖");
		emp.setSex("？");
		emp.setBirthday("1944-4-4");

		dept.getEmps().add(emp);

		bs.add(dept);

	}

	@Test
	public void delete() {
		Dept dept = (Dept) bs.getObjectById(Dept.class, 2);

		bs.delete(dept);

	}

	@Test
	public void update() {
		Dept dept = (Dept) bs.getObjectById(Dept.class, 1);
		dept.setDeptName("电台");

		bs.update(dept);

	}

	@Test
	public void query() {
		Dept dept = (Dept) bs.getObjectById(Dept.class, 5);

		for (Emp emp : dept.getEmps()) {
			System.out.println(dept.getDeptName() + ":" + emp.getName());
		}
	}

	/**
	 * 统计查询 查询每个部门的员工人数
	 */
	@Test
	public void getEmpInfo() {
		Session session = HibernateSessionFactory.getSession();

		Criteria criteria = session.createCriteria(Dept.class)
				.setFetchMode("emps", FetchMode.JOIN).createAlias("emps", "e");

		ProjectionList pjl = Projections.projectionList()
				.add(Projections.groupProperty("deptId"))
				.add(Projections.groupProperty("deptName"))
				.add(Projections.groupProperty("address"))
				.add(Projections.count("e.deptId"));

		criteria.setProjection(pjl);

		for (Object[] o : (List<Object[]>) criteria.list()) {
			System.out.println(o[0] + "," + o[1] + "," + o[2] + "," + o[3]);
		}

	}

}
