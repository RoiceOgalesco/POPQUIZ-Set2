package com.uap.it1331l.studentgradeapi.model;

import java.util.List;

public class Info {
	private String studentId;
	private String studentName;
	private String comment = "";
	private float averageGrade;
    private List<ratings> subjectRatings;

	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public float getAverageGrade() {
		return averageGrade;
	}
	public void setAverageGrade(float averageGrade) {
		this.averageGrade = averageGrade;
	}
	public List<ratings> getSubjectRatings() {
		return subjectRatings;
	}
	public void setSubjectRatings(List<ratings> subjectRatings) {
		this.subjectRatings = subjectRatings;
	}
}
