package com.qhit.lh.gr3.asa.t1.service.Impl;

import java.util.List;

import com.qhit.lh.gr3.asa.t1.dao.BaseDao;
import com.qhit.lh.gr3.asa.t1.dao.Impl.BaseDaoImpl;
import com.qhit.lh.gr3.asa.t1.service.BaseService;

/**
 * @author 李硕
 * TODO
 * 2017年12月12日上午11:16:36
 */
public class BaseServiceImpl implements BaseService {
    private BaseDao baseDao=new BaseDaoImpl();
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		baseDao.delete(obj);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		baseDao.update(obj);
	}

	@Override
	public List<Object> getAll(String fromObject) {
		// TODO Auto-generated method stub
		return baseDao.getAll(fromObject);
	}

}
