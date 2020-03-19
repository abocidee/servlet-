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
		//得到表单提交过来的性别
		String gender = request.getParameter("gender");
		//对性别进行转码
//		gender = 
//				new String(gender.getBytes("iso8859-1"), 
//						"utf-8");
		double bmi = w/h/h;
		System.out.println(gender);
		String info = "体重正常";
		if (bmi<19) {
			info = "该多吃点儿了 ";
		}else if (bmi>25) {
			info = "超重了 注意身体 少吃点儿";
		}
		if (gender.equals("男")) {
			info = "帅哥 "+info;
		}else{
			info = "美女"+info;
		}
		//设置响应类型及编码格式
		response.setContentType("text/html;charset=utf-8");
		PrintWriter printWriter = response.getWriter();
		printWriter.println(info);
		printWriter.close();
		
		
		
		 
	}
}
