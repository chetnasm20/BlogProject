package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connection.FactoryProvider;
import com.model.Blog;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		int id=Integer.parseInt(req.getParameter("blogId"));
		Session session=FactoryProvider.getFactory().openSession();
		
		Blog b1=session.get(Blog.class, id);
		session.delete(b1);
		Transaction tx=session.beginTransaction();
		tx.commit();
		res.sendRedirect("ShowBlog.jsp");
		
		
	
	}

}
