package com.kavin;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		session.setAttribute("password", password);
		res.sendRedirect("payment");
		
	}

}
