package com.priyaServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet { //any class we create should extends HttpServlet class.

	//we need to use default service method which takes request and response parameters.
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		
		PrintWriter out = res.getWriter(); //to print the value on webpage as a response we need to use this
		out.println("result is" +  k);		
	}
}

//to attach our html page and this addition class we need to configure in web.xml file.
//so that it will get to which request has to call which servlet.

//System.out.println(); - will print the value on console

//Service() will internall call doPost() and doGet() methods. both gives same results in above case.
//when we mension post in html file here we have get method it will not work. in both the fles it should be same.