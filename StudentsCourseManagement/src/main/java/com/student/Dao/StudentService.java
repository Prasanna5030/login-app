package com.student.Dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.studentBean.Student;

public class StudentService {
	private StudentDao studentDao;
	public StudentService() {
		try {
			studentDao = new StudentDaoImpl();
		} catch ( Exception e) {
			e.printStackTrace();
		}
	}

	public List<Student> getAllStudents(){
		return studentDao.getAllStudents();	
	}
	
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}
	public void  deleteStudentById(int id) {
		studentDao.deleteStudentById(id);
	}
}
