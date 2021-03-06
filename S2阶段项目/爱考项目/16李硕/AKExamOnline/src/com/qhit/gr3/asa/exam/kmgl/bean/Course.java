package com.qhit.gr3.asa.exam.kmgl.bean;

import java.util.HashSet;
import java.util.Set;

import com.qhit.gr3.asa.exam.tkgl.bean.MachineQuestion;
import com.qhit.gr3.asa.exam.tkgl.bean.WrittenQuestion;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	private Integer csId;
	private String csName;
	private String stage;
	private String major;
	
	//1-n
		private Set<WrittenQuestion> writtenQuestions = new HashSet<>();
		private Set<MachineQuestion> machineQuestions = new HashSet<>();

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** full constructor */
	public Course(String csName, String stage, String major) {
		this.csName = csName;
		this.stage = stage;
		this.major = major;
	}

	// Property accessors

	public Integer getCsId() {
		return this.csId;
	}

	public void setCsId(Integer csId) {
		this.csId = csId;
	}

	public String getCsName() {
		return this.csName;
	}

	public void setCsName(String csName) {
		this.csName = csName;
	}

	public String getStage() {
		return this.stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Set<WrittenQuestion> getWrittenQuestions() {
		return writtenQuestions;
	}

	public void setWrittenQuestions(Set<WrittenQuestion> writtenQuestions) {
		this.writtenQuestions = writtenQuestions;
	}

	public Set<MachineQuestion> getMachineQuestions() {
		return machineQuestions;
	}

	public void setMachineQuestions(Set<MachineQuestion> machineQuestions) {
		this.machineQuestions = machineQuestions;
	}

}