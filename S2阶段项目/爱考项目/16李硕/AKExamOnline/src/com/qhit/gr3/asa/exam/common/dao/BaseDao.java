package com.qhit.gr3.asa.exam.common.dao;

import org.hibernate.Session;

import com.qhit.gr3.asa.exam.common.utils.HibernateSessionFactory;

/**
 * @author 李硕
 *
 */
public class BaseDao {
	
	
	public Session getSession(){
		 return HibernateSessionFactory.getSession();
				 
	}

}
