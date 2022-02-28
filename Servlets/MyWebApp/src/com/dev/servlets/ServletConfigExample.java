package com.dev.servlets;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/configExample",initParams= {@WebInitParam(name="url",value="www.google.com")})
public class ServletConfigExample extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		String password = config.getInitParameter("password");
		PrintWriter out = resp.getWriter();
		out.println(password);
		String url = config.getInitParameter("url");
		out.println(url);
		
		
	}

}
