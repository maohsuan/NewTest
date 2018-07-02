package com.yxtech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void init() throws ServletException{
		System.out.println("初始化 init()");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		System.out.println("調用 doGet()方法");
		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>測試0~10循環</title>");
		out.println("<body>");
		out.println("開始執行");
		int count=0;
		for(int i=0;i<=10;i++){
			count+=i;		
		}
		out.println("程序執行結果:"+count);
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();		
	}
	
	public void postGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		System.out.println("調用postGet()方法");
		doGet(request,response);
	}
	
	public void destroy(){
		System.out.println("調用destory()方法");
	}

}
