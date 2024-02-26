package com.student.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.batch.Dao.BatchService;
import com.batchBean.Batch;


public class updateBatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public updateBatch() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		
		int batch_Id=Integer.parseInt(request.getParameter("batch_id"));
		int student_Id= Integer.parseInt(request.getParameter("student_id"));
		String course_name = request.getParameter("course_name");
		String enroll_date= request.getParameter("enrolldate");
		String instructor=   request.getParameter("instructor");
		String batch_session= request.getParameter("batch_session");
		String session_mode = request.getParameter("session_mode");
		String session_course  = request.getParameter("session_course");
		
		Batch batch= new Batch(batch_Id,student_Id,course_name,enroll_date,instructor,batch_session,session_mode,session_course);
		BatchService batchService = new BatchService();
		batchService.updateBatch(batch);
		out.println("record updated");
		response.sendRedirect("ListOfBatches.jsp");
	}

}
