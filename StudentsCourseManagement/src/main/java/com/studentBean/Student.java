package com.studentBean;

import java.util.Arrays;

public class Student {
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String dob;
	private char gender;
	private String qualification;
	private String instructor_name;
	private String enrollment_date;
	private String skills;
	private String courses;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getInstructor_name() {
		return instructor_name;
	}
	public void setInstructor_name(String instructor_name) {
		this.instructor_name = instructor_name;
	}
	public String getEnrollment_date() {
		return enrollment_date;
	}
	public void setEnrollment_date(String enrollment_date) {
		this.enrollment_date = enrollment_date;
	}
	
	
	public Student(int id, String firstname, String lastname, String dob, char gender, String qualification,
			String instructor_name, String enrollment_date, String skills, String courses) {
		super();
		this.id=id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.gender = gender;
		this.qualification = qualification;
		this.instructor_name = instructor_name;
		this.enrollment_date = enrollment_date;
		this.skills = skills;
		this.courses = courses;
	}

	public String getSkills() {
		return skills;
	}
	
	
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	
	
	@Override
	public String toString() {
		return "studentdata [firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob + ", gender=" + gender
				+ ", qualification=" + qualification + ", instructor_name=" + instructor_name + ", enrollment_date="
				+ enrollment_date + ", skills=" + skills + ", courses=" + courses
				+ "]";
	}

	
	public Student( String firstname, String lastname, String dob, char gender, String qualification,
			String instructor_name, String enrollment_date, String skills, String courses) {
		super();

		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.gender = gender;
		this.qualification = qualification;
		this.instructor_name = instructor_name;
		this.enrollment_date = enrollment_date;
		this.skills = skills;
		this.courses = courses;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(int id, String firstname, String lastname, String email, String dob, char gender,
			String qualification, String instructor_name, String enrollment_date, String skills, String courses) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.qualification = qualification;
		this.instructor_name = instructor_name;
		this.enrollment_date = enrollment_date;
		this.skills = skills;
		this.courses = courses;
	}
	public Student(String firstname, String lastname, String email, String dob, char gender, String qualification,
			String instructor_name, String enrollment_date, String skills, String courses) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.qualification = qualification;
		this.instructor_name = instructor_name;
		this.enrollment_date = enrollment_date;
		this.skills = skills;
		this.courses = courses;
	}
}
