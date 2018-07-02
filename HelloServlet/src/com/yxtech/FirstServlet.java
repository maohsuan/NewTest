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
		System.out.println("��l�� init()");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		System.out.println("�ե� doGet()��k");
		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>����0~10�`��</title>");
		out.println("<body>");
		out.println("�}�l����");
		int count=0;
		for(int i=0;i<=10;i++){
			count+=i;		
		}
		out.println("�{�ǰ��浲�G:"+count);
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();		
	}
	
	public void postGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		System.out.println("�ե�postGet()��k");
		doGet(request,response);
	}
	
	public void destroy(){
		System.out.println("�ե�destory()��k");
	}

}
