package com.qhit.lh.gr3.asa.t1.service;

import java.util.List;

/**
 * @author 李硕
 * TODO
 * 2017年12月12日上午11:16:38
 */
public interface BaseService {
	
    public void add(Object obj);
	
	public void delete(Object obj);
	
	public void update(Object obj);
	
	public List<Object> getAll(String fromObject); 

}
