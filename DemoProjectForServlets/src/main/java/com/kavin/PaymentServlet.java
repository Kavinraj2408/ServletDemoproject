package com.kavin;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class PaymentServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		HttpSession session = req.getSession();
		String name =(String) session.getAttribute("name");
		String password =(String) session.getAttribute("password");
		
		res.getWriter().println("in a payment servlet");
		res.getWriter().println("Name : " + name + " and password : " + password);
	}
}
