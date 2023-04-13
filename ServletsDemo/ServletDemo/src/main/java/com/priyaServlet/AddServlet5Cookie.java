package com.priyaServlet;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet5Cookie extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int m = Integer.parseInt(req.getParameter("num1"));
		int n = Integer.parseInt(req.getParameter("num2"));
		
		int p = n+m;
		
		Cookie cookie = new Cookie("p", p + "");
		res.addCookie(cookie);
		
		res.sendRedirect("Cook");
	}

}
