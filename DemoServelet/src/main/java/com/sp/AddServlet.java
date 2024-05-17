package com.sp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int n1=Integer.parseInt(req.getParameter("num1"));
		int n2=Integer.parseInt(req.getParameter("num2"));
		int result=n1+n2;
		//PrintWriter out=res.getWriter();
		//out.print("Result is: "+result);
//		req.setAttribute("n1", n1);
//		req.setAttribute("n2",n2);
//		req.setAttribute("result", result);

//      calling another servlet by using request dispatcher	
//		RequestDispatcher rd=req.getRequestDispatcher("square");
//		rd.forward(req,res);
		
//		send redirect method
//		res.sendRedirect("square?result="+result);
	
//		session 
//		HttpSession session=req.getSession();
//		session.setAttribute("result", result);
//		res.sendRedirect("square");
	
//		Cookies
		Cookie cookie=new Cookie("result",result+"");
		res.addCookie(cookie);
		res.sendRedirect("square");
		
	}

}
