package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bdd.blog.InfosPageBlog;

public class BlogPage extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InfosPageBlog infos_pageBlog;
	
	public BlogPage() {
		infos_pageBlog = new InfosPageBlog();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/pageBlog.jsp" ).forward( request, response );
	}

}
