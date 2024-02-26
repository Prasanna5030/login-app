package com.batchBean;

public class Batch {

	int batch_id;
	int student_id;
	String course_name;
	String enroll_date;
	String instructor;
	String batch_session;
	String session_mode;
	String session_course;
	
	public Batch(int batch_id, int student_id, String course_name, String enroll_date, String instructor,
			String batch_session, String session_mode, String session_course) {
		super();
		this.batch_id = batch_id;
		this.student_id = student_id;
		this.course_name = course_name;
		this.enroll_date = enroll_date;
		this.instructor = instructor;
		this.batch_session = batch_session;
		this.session_mode = session_mode;
		this.session_course = session_course;
	}

	@Override
	public String toString() {
		return "Batch [batch_id=" + batch_id + ", student_id=" + student_id + ", course_name=" + course_name
				+ ", enroll_date=" + enroll_date + ", instructor=" + instructor + ", batch_session=" + batch_session
				+ ", session_mode=" + session_mode + ", session_course=" + session_course + "]";
	}

	public int getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getEnroll_date() {
		return enroll_date;
	}

	public void setEnroll_date(String enroll_date) {
		this.enroll_date = enroll_date;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getBatch_session() {
		return batch_session;
	}

	public void setBatch_session(String batch_session) {
		this.batch_session = batch_session;
	}

	public String getSession_mode() {
		return session_mode;
	}

	public void setSession_mode(String session_mode) {
		this.session_mode = session_mode;
	}

	public String getSession_course() {
		return session_course;
	}

	public void setSession_course(String session_course) {
		this.session_course = session_course;
	}

	public Batch() {
	}

}
