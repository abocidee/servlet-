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
		//��ʼ��ȡ����
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] hobbys = request.getParameterValues("hobby");
		String edu = request.getParameter("edu");
		//������Ӧ���ͼ��ַ��� *****���д���һ��Ҫ��printwriter֮ǰ
		response.setContentType("text/html;charset=utf-8");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("�û���:"+username+" ����:"+password);
		printWriter.println("�Ա�:"+gender);
		printWriter.println("����:"+Arrays.toString(hobbys));
		printWriter.println("ѧ��:"+edu);
		
		printWriter.close();
		
		
		
		
		
		
	}
	
}
