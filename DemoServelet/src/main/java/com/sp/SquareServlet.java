package com.sp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
//		int n1=(int) req.getAttribute("n1");
//		int n2=(int) req.getAttribute("n2");
//		int result=(int) req.getAttribute("result");
		int result=Integer.parseInt(req.getParameter("result"));
		result=result*result;
		PrintWriter out=res.getWriter();
		out.print("square of addition of the number is : " +result);
		
	}

}
 