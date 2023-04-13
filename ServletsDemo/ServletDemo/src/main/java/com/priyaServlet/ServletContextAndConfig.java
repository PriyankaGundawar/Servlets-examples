package com.priyaServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextAndConfig extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		out.println("Hello");
		
//		ServletContext ctx = getServletContext(); //ServletContext can be share to by all the servlets
//		String st = ctx.getInitParameter("name"); in web.xml we specify(context-param) outside of the servlet
//		out.println(st);
		
		ServletConfig cfg = getServletConfig(); //ServletConfig will specify for specific servlets
		String st = cfg.getInitParameter("name"); //in web.xml we specify(init-param) inside the any servlet
		out.println(st);
		
		
	}

}
