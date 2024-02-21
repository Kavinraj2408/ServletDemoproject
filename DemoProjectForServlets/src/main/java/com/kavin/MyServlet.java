package com.kavin;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		res.getWriter().print("Hi ");
		
//		ServletContext context = getServletContext();
//		String name = context.getInitParameter("name");
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("name");
		res.getWriter().println(name);
	}

}
