package com.qhit.gr3.asa.exam.tkgl.dao;

import java.util.List;
import java.util.Map;

import com.qhit.gr3.asa.exam.common.bean.PageBean;
import com.qhit.gr3.asa.exam.kmgl.bean.Course;
import com.qhit.gr3.asa.exam.tkgl.bean.WrittenQuestion;

public interface QuestionDao {
	/**
	 * @param csId
	 * @param qtype
	 * @param degree
	 * 获取题目数
	 * @return
	 */
	public int getQuestionMax(int csId,String qtype,String degree); 
	
	
	/**
	 * 题库管理
	 * @param parameter
	 * @return
	 * 题库列表
	 */
	public List<Course> getCourseInfo(Map parameter);
	
	
	/**
	 * @param pageBean
	 * @param course
	 * @param pageIndex
	 * @return
	 * 笔试题列表分页数据
	 */
	public PageBean<WrittenQuestion> getWrittenList(
			    PageBean<WrittenQuestion> pageBean,
			    Course course,
			     int pageIndex);
    
	/**
	 * 添加笔试题
	 * @param writtenQuestion
	 */
	
	public void addWrittenQuestion(WrittenQuestion writtenQuestion);
	
	
	/**
	 * @param writtenQuestion
	 * @return
	 * 根据id查询试题
	 */
	public WrittenQuestion getWrittenQuestionById(WrittenQuestion writtenQuestion);
	
	/**
	 * @param writtenQuestion
	 * 更新数据
	 */
	public void updateWrittenQuestion(WrittenQuestion writtenQuestion);
	
	/**
	 * @param listQuestion
	 * 批量导入笔试题
	 */
	public void inportWrittenQuestion(List<WrittenQuestion> listWQuestions );

}
