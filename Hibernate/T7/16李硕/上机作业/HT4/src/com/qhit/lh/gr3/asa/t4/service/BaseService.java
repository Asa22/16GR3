package com.qhit.lh.gr3.asa.t4.service;

import java.util.List;

import com.qhit.lh.gr3.asa.t4.bean.Emp;

public interface BaseService {
	/**增
	 * @param obj
	 */
	public void add(Object obj);
	
	/**删
	 * @param obj
	 */
	public void delete(Object obj);
	
	/**改
	 * @param obj
	 */
	public void update(Object obj);
	
	/**查
	 * @param fromObject
	 * @return
	 */
	public List<Object> getAll(String fromObject);

	public Object getObjectById(Class clazz, int id);

	/**
	 * @param name
	 * @return
	 */
	public List<Emp> getEmpByName(String name);
}
