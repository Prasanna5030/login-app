package com.student.Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.studentBean.Student;
import com.utils.DBUtil;

public class StudentDaoImpl implements StudentDao{
 private Connection connection=null;
	public StudentDaoImpl()   {
		 try {

			 DBUtil dbutil= new DBUtil();
			 connection=dbutil.getConnection();
		} catch (ClassNotFoundException | SQLException | IOException e) {
		
		e.printStackTrace();
		} 
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> studentList = new LinkedList<Student>();
		PreparedStatement pst=null;
		try {
		pst= connection.prepareStatement("select * from students");
		ResultSet rs= pst.executeQuery();
		while(rs.next()) {
			int id = rs.getInt("id");
			String fname =rs.getString("first_name");
			String lname =rs.getString("last_name");
			String email =rs.getString("email");
			char gender= rs.getString("gender").charAt(0);
			String dob= rs.getString("date_of_birth");
			String qualification= rs.getString("qualification");
			String skills= rs.getString("skills");
			String instructor= rs.getString("instructor_name");
			String courses= rs.getString("courses");
			String enroll_date= rs.getString("enrollment_date");
			Student s1= new Student(id, fname,lname,email ,dob,gender,qualification,instructor,enroll_date,skills,courses);
			
			studentList.add(s1);
		}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return studentList;
	}

	@Override
	public Student getStudentById(int id) {
		Student student = null;
		try {
			PreparedStatement pst=connection.prepareStatement("select * from students where id=?");
			pst.setInt(1, id);
		ResultSet rs=	pst.executeQuery();
		if(rs.next()) {
			int sid = rs.getInt("id");
			String fname =rs.getString("first_name");
			String lname =rs.getString("last_name");
			String email =rs.getString("email");
			char gender= rs.getString("gender").charAt(0);
			String dob= rs.getString("date_of_birth");
			String qualification= rs.getString("qualification");
			String skills= rs.getString("skills");
			String instructor= rs.getString("instructor_name");
			String courses= rs.getString("courses");
			String enroll_date= rs.getString("enrollment_date");
			student= new Student(sid, fname,lname ,email,dob,gender,qualification,instructor,enroll_date,skills,courses);
		}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return student ;
	}

	@Override
	public void addStudent(Student student) {
		try {
			
			PreparedStatement pst= connection.prepareStatement("insert into students values(null,?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1, student.getFirstname());
			pst.setString(2, student.getLastname());
			
			pst.setString(3, Character.toString(student.getGender()));
			pst.setString(4, student.getDob());
			pst.setString(5, student.getQualification());
			pst.setString(6, student.getSkills());
			pst.setString(7, student.getInstructor_name());
			pst.setString(8, student.getCourses());
			pst.setString(9, student.getEnrollment_date());
			pst.setString(10, student.getEmail() );
			int i = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateStudent(Student student) {
		try {
			PreparedStatement pst= connection.prepareStatement("UPDATE STUDENTS  SET first_name=?, last_name=? ,  gender=? , date_of_birth=? , qualification=? , skills=?, instructor_name=? , courses=?, enrollment_date=?  , email=? WHERE id=?");
			pst.setString(1, student.getFirstname());
			pst.setString(2, student.getLastname());
			
			pst.setString(3, Character.toString(student.getGender()));
			pst.setString(4, student.getDob());
			pst.setString(5, student.getQualification());
			pst.setString(6, student.getSkills());
			pst.setString(7, student.getInstructor_name());
			pst.setString(8, student.getCourses());
			pst.setString(9, student.getEnrollment_date());
			pst.setString(10, student.getEmail() );
			pst.setInt(11,student.getId());
			int i = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteStudentById(int id) {

		try {
			PreparedStatement pst= connection.prepareStatement("DELETE FROM students WHERE id= ?");
			pst.setInt(1, id);
			int i= pst.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
