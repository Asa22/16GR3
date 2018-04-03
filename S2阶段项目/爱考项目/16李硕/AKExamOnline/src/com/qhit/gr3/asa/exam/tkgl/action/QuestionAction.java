package com.qhit.gr3.asa.exam.tkgl.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.gr3.asa.exam.common.bean.PageBean;
import com.qhit.gr3.asa.exam.kmgl.bean.Course;
import com.qhit.gr3.asa.exam.tkgl.bean.WrittenQuestion;
import com.qhit.gr3.asa.exam.tkgl.service.QuestionService;
import com.qhit.gr3.asa.exam.tkgl.service.QuestionServiceImpl;
import com.qhit.gr3.asa.exam.tkgl.utils.PoiReaderExcel;

public class QuestionAction extends ActionSupport {
	private QuestionService questionService= new QuestionServiceImpl();
	private Course course;//课程
	private String major;//专业方向
	private String stage;//阶段
	private WrittenQuestion writtenQuestion;//笔试题对象
	private List<Course> listCourse = new ArrayList<>();

	//实体分页列表数据
	private PageBean<WrittenQuestion> pageBean = new PageBean<>();
	private int pageIndex = 1;//指定页，初始化为1
	//导入实体集合
	private List<WrittenQuestion> listWQuestions = new ArrayList<>();
	//导入文件对象
	private File questionfile;
	
	private int radioEasyMax,radioNormalMax,radioDiffMax,cbEasyMax,cbNormalMax,cbDiffMax;
	
	/**
	 * @return
	 * 题库管理
	 */
	public String getCourseInfo(){
		//设置参数
		Map<String, String> parameter = new HashMap<>();
		if(major != null && !"".equals(major)){
			 parameter.put("major", major);
		}
		if(stage != null && !"".equals(stage)){
			parameter.put("stage", stage);
		}
		//查询题库列表数据
		listCourse = questionService.getCourseInfo(parameter);
		return "listCourse";
	}
	 
	public String getQuestionMax(){
		radioEasyMax = questionService.getQuestionMax(writtenQuestion.getCsId(), "单选","简单");
		radioNormalMax=questionService.getQuestionMax(writtenQuestion.getCsId(), "单选", "一般");
		radioDiffMax = questionService.getQuestionMax(writtenQuestion.getCsId(), "单选", "困难");
		cbEasyMax = questionService.getQuestionMax(writtenQuestion.getCsId(), "多选", "简单");
		cbNormalMax = questionService.getQuestionMax(writtenQuestion.getCsId(), "多选", "一般");
		cbDiffMax = questionService.getQuestionMax(writtenQuestion.getCsId(), "多选", "困难");
		return "getQuestionMax";
	}
	/**
	 * @return
	 * 获取试题列表
	 */
	public String getWrittenList(){
		pageBean = questionService.getWrittenList(pageBean, course, pageIndex);
		System.out.println("数据大小:"+pageBean.getItems().size());
		return "listWritten";
	}
	/**
	 * @return
	 * 添加笔试题
	 */
	public String addWrittenQuestion(){
		System.out.println(writtenQuestion.getCsId());
		//设置课程试题的关联
		writtenQuestion.setCourse(course);
		
		questionService.addWrittenQuestion(writtenQuestion);
		return "addWrittenQuestion";
	}
	
	/**
	 * @return
	 * 根据试题编号查询试题对象
	 */
	public String getWrittenQuestionById(){
		writtenQuestion = questionService.getWrittenQuestionById(writtenQuestion);
		return "getWrittenQuestionById";
	}
	
	/**
	 * @return
	 * 更新
	 */
	public String updateWrittenQuestion(){
		//设置关联
		writtenQuestion.setCourse(course);
		
		questionService.updateWrittenQuestion(writtenQuestion);
		return "updateWrittenQuestion";
	}


	/**
	 * @return
	 * 批量导入笔试题
	 * @throws FileNotFoundException 
	 */
	public String inportWrittenQuestions() throws FileNotFoundException {
		
		if(questionfile != null){
			//1,上传到服务器（struts2）(1,jsp表单提交控件、2，action)
			FileInputStream fis = new FileInputStream(questionfile);
			//2,读取excel文件中的数据,获取试题对象集合（POI:1,导包、2，读取数据流获取数据集合）
			listWQuestions  = PoiReaderExcel.readerExcel(fis, course);
			//3,批量添加到数据库(hibernate)
			questionService.inportWrittenQuestion(listWQuestions );
		}else{
			//上传文件失败的判断，暂时不做
		}
		return "inportWrittenQuestions";
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public WrittenQuestion getWrittenQuestion() {
		return writtenQuestion;
	}

	public void setWrittenQuestion(WrittenQuestion writtenQuestion) {
		this.writtenQuestion = writtenQuestion;
	}

	public List<Course> getListCourse() {
		return listCourse;
	}

	public void setListCourse(List<Course> listCourse) {
		this.listCourse = listCourse;
	}

	public PageBean<WrittenQuestion> getPageBean() {
		return pageBean;
	}

	public void setPageBean(PageBean<WrittenQuestion> pageBean) {
		this.pageBean = pageBean;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public List<WrittenQuestion> getListQuestion() {
		return listWQuestions;
	}

	public void setListQuestion(List<WrittenQuestion> listQuestion) {
		this.listWQuestions = listQuestion;
	}

	public File getQuestionfile() {
		return questionfile;
	}

	public void setQuestionfile(File questionfile) {
		this.questionfile = questionfile;
	}

	public int getRadioEasyMax() {
		return radioEasyMax;
	}

	public void setRadioEasyMax(int radioEasyMax) {
		this.radioEasyMax = radioEasyMax;
	}

	public int getRadioNormalMax() {
		return radioNormalMax;
	}

	public void setRadioNormalMax(int radioNormalMax) {
		this.radioNormalMax = radioNormalMax;
	}

	public int getRadioDiffMax() {
		return radioDiffMax;
	}

	public void setRadioDiffMax(int radioDiffMax) {
		this.radioDiffMax = radioDiffMax;
	}

	public int getCbEasyMax() {
		return cbEasyMax;
	}

	public void setCbEasyMax(int cbEasyMax) {
		this.cbEasyMax = cbEasyMax;
	}

	public int getCbNormalMax() {
		return cbNormalMax;
	}

	public void setCbNormalMax(int cbNormalMax) {
		this.cbNormalMax = cbNormalMax;
	}

	public int getCbDiffMax() {
		return cbDiffMax;
	}

	public void setCbDiffMax(int cbDiffMax) {
		this.cbDiffMax = cbDiffMax;
	}
	
	
}
