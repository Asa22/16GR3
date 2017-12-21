package com.qhit.lh.gr3.asa.t4.dao;

import java.util.List;

public interface BaseDao {
	
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
 
}
