package com.priyaServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet5CookieCalled extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int p = 0;	
		
		Cookie cookies[] = req.getCookies();
		
		for (Cookie c: cookies) {
			if(c.getName().equals("p"))
				p = Integer.parseInt(c.getValue());
			}
		
		p = p +10;
		
		PrintWriter out = res.getWriter();
		out.println("result is "+ p);
		
		//System.out.println("Cook called");
		
	}

}
