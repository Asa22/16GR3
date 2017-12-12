package com.qhit.lh.gr3.asa.t1.dao.Impl;

import java.util.List;







import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.asa.t1.dao.BaseDao;
import com.qhit.lh.gr3.asa.t1.utils.HibernateSessionFactory;


/**
 * @author 李硕
 * TODO
 * 2017年12月12日上午11:16:24
 */
public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		//1.获取session对象
		Session session = HibernateSessionFactory.getSession();
		//2.开启事物
		Transaction ts = session.beginTransaction();
		//3.执行
		session.save(obj);
		//4.提交事务
		ts.commit();
		//5.释放资源
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		//1.获取session对象
				Session session = HibernateSessionFactory.getSession();
				//2.开启事物
				Transaction ts = session.beginTransaction();
				//3.执行
				session.delete(obj);
				//4.提交事务
				ts.commit();
				//5.释放资源
				HibernateSessionFactory.closeSession();
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//1.获取session对象
				Session session = HibernateSessionFactory.getSession();
				//2.开启事物
				Transaction ts = session.beginTransaction();
				//3.执行
				session.update(obj);
				//4.提交事务
				ts.commit();
				//5.释放资源
				HibernateSessionFactory.closeSession();
	}

	@Override
	public List<Object> getAll(String fromObject) {
		// TODO Auto-generated method stub
		//1.获取session对象
		Session session = HibernateSessionFactory.getSession();
		//2.开启事物
		Transaction ts = session.beginTransaction();
		//3.获取查询器对象
		Query query= session.createQuery(fromObject);
		List<Object> list = query.list();  
		//4.提交事务
		ts.commit();
		//5.释放资源
		HibernateSessionFactory.closeSession();
		return list;
	}

}
