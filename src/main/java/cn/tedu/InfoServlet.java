package cn.tedu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InfoServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, 
					IOException {
		//开始获取参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] hobbys = request.getParameterValues("hobby");
		String edu = request.getParameter("edu");
		//设置响应类型及字符集 *****此行代码一定要在printwriter之前
		response.setContentType("text/html;charset=utf-8");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("用户名:"+username+" 密码:"+password);
		printWriter.println("性别:"+gender);
		printWriter.println("爱好:"+Arrays.toString(hobbys));
		printWriter.println("学历:"+edu);
		
		printWriter.close();
		
		
		
		
		
		
	}
	
}
