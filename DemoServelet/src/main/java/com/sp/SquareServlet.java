package com.sp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int n1=(int) req.getAttribute("n1");
		int n2=(int) req.getAttribute("n2");
		int result=(int) req.getAttribute("result");
//		int result=Integer.parseInt(req.getParameter("result"));
		
//      getting session value and printing it
//		HttpSession session= req.getSession();
//		int result=(int)session.getAttribute("result");
//		result=result*result; 
		
//	    getting cookie and printing 
//		int result=0;
//		Cookie cookies[]=req.getCookies();
//		for(Cookie c:cookies)
//		{
//			if(c.getName().equals("result"))
//			{
//				result=Integer.parseInt(c.getValue());
//			}
//			
//		}
		result=result*result; 
		PrintWriter out=res.getWriter();
		out.print("square of addition of the number is : " +result);
		
	}

}
 