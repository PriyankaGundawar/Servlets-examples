package com.priyaServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet4HttpSessionCalled extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		HttpSession session = req.getSession();
		int z = (int) session.getAttribute("z");
		
		
		//int z = Integer.parseInt(req.getParameter("z"));
		z= z+5;
		PrintWriter out = res.getWriter();
		out.println("Called " +z);
		
		
	}

}
