package com.dev.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/readCookie")
public class ReadCookie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		PrintWriter out = resp.getWriter();
		if(cookies!=null)
		{
			for(Cookie c :cookies)
			{
				if(c.getName().equals("name"))
				{
					c.setMaxAge(-1);
					
				}
			}
		}
		else
		{
			out.println("No Cookies are Present");
		}
	}

}
