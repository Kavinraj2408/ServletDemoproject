package com.kavin;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {//we should use service as a method name in order to make it as a servlet
	
		//request Dispatcher
//		int k = (int) req.getAttribute("k");
		
		//URL rewriting
//		int k = Integer.parseInt(req.getParameter("k"));
		
		//Session Management
//		HttpSession session = req.getSession();
//		int k = (int)session.getAttribute("k");
		
		//Cookies
		Cookie[] cookies = req.getCookies();
		int k =0;
		for(Cookie c:cookies) {
			if(c.getName().equals("k")){
				k = Integer.parseInt(c.getValue());
			}
		}
		
		k = k*k;
//		res.getWriter().println("<html><body bgcolor ='cyan'>");
		res.getWriter().println("in a Square servlet");
		res.getWriter().println("Square for the given num is --> "+k);
//		res.getWriter().print("</body></html>");
		System.out.println("in a square servlet");
	}
}
