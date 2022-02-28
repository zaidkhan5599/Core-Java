package com.dev.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/request")
public class RequestMethods extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String method = req.getMethod();
		out.println("Method is "+method);
		String buff =req.getRequestURI().toString();
		out.println("Url is "+buff);
		out.println("Protocol is"+req.getProtocol());
//		String[] para = req.getParameterValues("lan");
//		out.println("Parameter is "+Array.getChar(para, 0));
		String str = req.getParameter("lang");
		out.println("Parameter is"+str);
		String [] para = req.getParameterValues("lan");
		out.println("Parameters are  "+Arrays.toString(para));
		
		
	}
	

}
