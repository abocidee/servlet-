package cn.tedu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BMIServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double h = Double.parseDouble(request.getParameter("height"));
		double w = Double.parseDouble(request.getParameter("weight"));
		//�õ����ύ�������Ա�
		String gender = request.getParameter("gender");
		//���Ա����ת��
//		gender = 
//				new String(gender.getBytes("iso8859-1"), 
//						"utf-8");
		double bmi = w/h/h;
		System.out.println(gender);
		String info = "��������";
		if (bmi<19) {
			info = "�ö�Ե���� ";
		}else if (bmi>25) {
			info = "������ ע������ �ٳԵ��";
		}
		if (gender.equals("��")) {
			info = "˧�� "+info;
		}else{
			info = "��Ů"+info;
		}
		//������Ӧ���ͼ������ʽ
		response.setContentType("text/html;charset=utf-8");
		PrintWriter printWriter = response.getWriter();
		printWriter.println(info);
		printWriter.close();
		
		
		
		 
	}
}
