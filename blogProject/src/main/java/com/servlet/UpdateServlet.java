package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.*;

import org.hibernate.Session;

import com.connection.FactoryProvider;
import com.model.Blog;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("blogid"));
		String title=request.getParameter("title");
		String desc=request.getParameter("description");
		
		Session session=FactoryProvider.getFactory().openSession();
		Blog b1=session.get(Blog.class, id);
		b1.setTitle("id");
		b1.setAuthor("title");
		b1.setDescription("desc");
		session.update(b1);
		Transaction tx=session.beginTransaction();
		tx.commit();
		
	}

}
