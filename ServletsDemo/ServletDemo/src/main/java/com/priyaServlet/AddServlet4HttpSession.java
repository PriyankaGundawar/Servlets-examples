package com.priyaServlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet4HttpSession extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int x = Integer.parseInt(req.getParameter("n1"));
		int y = Integer.parseInt(req.getParameter("n2"));
		
		int z = x+y;
		
		HttpSession session = req.getSession();
		session.setAttribute("z", z);
		
		//res.sendRedirect("sr1");
		res.sendRedirect("HttpS");
		
	}

}
