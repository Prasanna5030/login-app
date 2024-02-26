package com.student.Dao;

import java.util.List;

import com.studentBean.Student;

public interface StudentDao {

	public List<Student> getAllStudents();
	Student getStudentById(int id);
	void addStudent(Student student);
	void updateStudent(Student student);
	void deleteStudentById(int id);
}
