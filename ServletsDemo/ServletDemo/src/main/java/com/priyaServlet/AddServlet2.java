package com.priyaServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet2 extends HttpServlet { 

	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int k = a+b;
		
		req.setAttribute("k", k); //seeting attribute value.
		
		RequestDispatcher rd = req.getRequestDispatcher("sq"); //to call other servlet from thii servlet
		rd.forward(req, res);
	}
}

