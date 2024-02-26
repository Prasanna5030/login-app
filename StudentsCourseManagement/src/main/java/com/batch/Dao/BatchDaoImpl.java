package com.batch.Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.batchBean.Batch;
import com.utils.DBUtil;

import jakarta.servlet.ServletContext;

public class BatchDaoImpl implements BatchDao{
	Connection connection=null;
	public BatchDaoImpl() {
	
		DBUtil dbutil= new DBUtil();
	try {
	 connection=	dbutil.getConnection();
	} catch (ClassNotFoundException | IOException | SQLException e) {
		e.printStackTrace();
	} 
	}

	@Override
	public List<Batch> getAllBatches() {
		List<Batch> BatchList= new LinkedList<Batch>();
		try {
			PreparedStatement pst= connection.prepareStatement("select * from batch ");
			ResultSet rs= pst.executeQuery();
			while(rs.next()) {
				Batch batch = new Batch(rs.getInt("batch_id"),
														rs.getInt("student_id"),
														rs.getString("course_name"),
														rs.getString("enroll_date"),
														rs.getString("instructor"),
														rs.getString("batch_session"),
														rs.getString("session_mode"),
														rs.getString("session_course")
														);
				BatchList.add(batch);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return BatchList;
	}

	@Override
	public Batch getBatchById(int id) {
		Batch batch= null;
		try {
			PreparedStatement pst= connection.prepareStatement("SELECT * FROM batch WHERE batch_id=? ");
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				batch= new Batch(rs.getInt("batch_id"),
						rs.getInt("student_id"),
						rs.getString("course_name"),
						rs.getString("enroll_date"),
						rs.getString("instructor"),
						rs.getString("batch_session"),
						rs.getString("session_mode"),
						rs.getString("session_course")
						);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return batch;
	}

	@Override
	public void addBatch(Batch batch) {
		try {
			PreparedStatement pst= connection.prepareStatement("INSERT INTO batch VALUES(?,?,?,?,?,?,?,?)");
			pst.setInt(1, batch.getBatch_id());
			pst.setInt(2, batch.getStudent_id());
			pst.setString(3, batch.getCourse_name());
			pst.setString(4, batch.getEnroll_date());
			pst.setString(5, batch.getInstructor());
			pst.setString(6, batch.getBatch_session());
			pst.setString(7, batch.getSession_mode());
			pst.setString(8, batch.getSession_course());
			int i=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateBatch(Batch batch) {
		try {
			PreparedStatement pst= connection.prepareStatement("UPDATE 	batch SET student_id=?, course_name=?, enroll_date=?, instructor=?, batch_session=?, session_mode=?, session_course=? WHERE batch_id= ?");
			
			pst.setInt(1, batch.getStudent_id());
			pst.setString(2, batch.getCourse_name());
			pst.setString(3, batch.getEnroll_date());
			pst.setString(4, batch.getInstructor());
			pst.setString(5, batch.getBatch_session());
			pst.setString(6, batch.getSession_mode());
			pst.setString(7, batch.getSession_course());
			pst.setInt(8, batch.getBatch_id());
			int i=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteBatchById(int id) {
		try {
		
			PreparedStatement pst= connection.prepareStatement("DELETE FROM batch WHERE batch_id=?");
			pst.setInt(1,id);
			pst.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
