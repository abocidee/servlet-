package cn.tedu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class ResponseServlet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		//������Ӧͷ����
		//������Ӧ�������ͺ��ַ���
		response.setContentType("text/html;charset=utf-8");
		//����ˢ��ʱ��
		response.setHeader("refresh", "3;info.html");
		PrintWriter printWriter = response.getWriter();
		
		printWriter.print("ע��ɹ�!3�����ת����ҳ");
		printWriter.close();
	}
	
	
	
	
}
