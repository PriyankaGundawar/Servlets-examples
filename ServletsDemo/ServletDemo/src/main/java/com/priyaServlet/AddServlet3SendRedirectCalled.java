package com.priyaServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet3SendRedirectCalled extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int z = Integer.parseInt(req.getParameter("z"));
		z= z+2;
		PrintWriter out = res.getWriter();
		out.println("Called " +z);
		
		
	}

}
