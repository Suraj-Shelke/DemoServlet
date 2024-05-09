package com.sp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
//		RequestDispatcher rd=req.getRequestDispatcher("square");
//		rd.forward(req,res);
		res.sendRedirect("square?result="+result);
	}

}
