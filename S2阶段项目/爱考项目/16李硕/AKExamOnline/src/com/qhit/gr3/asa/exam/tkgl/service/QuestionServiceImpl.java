package com.qhit.gr3.asa.exam.tkgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.gr3.asa.exam.common.bean.PageBean;
import com.qhit.gr3.asa.exam.kmgl.bean.Course;
import com.qhit.gr3.asa.exam.tkgl.bean.WrittenQuestion;
import com.qhit.gr3.asa.exam.tkgl.dao.QuestionDao;
import com.qhit.gr3.asa.exam.tkgl.dao.QuestionDaoImpl;

public class QuestionServiceImpl implements QuestionService{
	private QuestionDao questionDao=new QuestionDaoImpl();

	@Override
	public int getQuestionMax(int csId, String qtype, String degree) {
		// TODO Auto-generated method stub
		return questionDao.getQuestionMax(csId,qtype,degree);
	}

	@Override
	public List<Course> getCourseInfo(Map parameter) {
		// TODO Auto-generated method stub
		return questionDao.getCourseInfo(parameter);
	}

	@Override
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean, Course course, int pageIndex) {
		// TODO Auto-generated method stub
		return questionDao.getWrittenList(pageBean, course, pageIndex);
	}

	@Override
	public void addWrittenQuestion(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		questionDao.addWrittenQuestion(writtenQuestion);
	}

	@Override
	public WrittenQuestion getWrittenQuestionById(
			WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		return questionDao.getWrittenQuestionById(writtenQuestion);
	}

	@Override
	public void updateWrittenQuestion(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		questionDao.updateWrittenQuestion(writtenQuestion);
	}

	@Override
	public void inportWrittenQuestion(List<WrittenQuestion> listWQuestions ) {
		// TODO Auto-generated method stub
		questionDao.inportWrittenQuestion(listWQuestions );
	}

}
