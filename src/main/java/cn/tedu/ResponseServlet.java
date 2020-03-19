package cn.tedu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class ResponseServlet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		//设置响应头数据
		//设置响应数据类型和字符集
		response.setContentType("text/html;charset=utf-8");
		//设置刷新时间
		response.setHeader("refresh", "3;info.html");
		PrintWriter printWriter = response.getWriter();
		
		printWriter.print("注册成功!3秒后跳转到主页");
		printWriter.close();
	}
	
	
	
	
}
