package com.dev.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sendCookie")
public class SendCookie extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Cookie c1 = new Cookie("name","Bharat");
	c1.setMaxAge(60*60*24*7);
	resp.addCookie(c1);
	Cookie c2 = new Cookie("email","bjs020@g");
	resp.addCookie(c2);
	Cookie c3 = new Cookie("address","Pune");
	resp.addCookie(c3);
	PrintWriter out = resp.getWriter();
	out.println("Cookie Sent");
	
}
}
