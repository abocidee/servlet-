package cn.tedu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MethodServlet extends HttpServlet{

	
//	@Override
//	protected void service(HttpServletRequest request, 
//			HttpServletResponse response) 
//			throws ServletException, IOException {
//		 
//		String method = request.getMethod();
//		
//		System.out.println(method);
//
//	}
	
	
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
//		String method = request.getMethod();
//		if (method.equals("GET")) {
//			doGet(request, resp);
//		}else if (method.equals("POST")) {
//			doPost(request, resp);
//		}
//	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.getWriter().println("Get");
		 
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		resp.getWriter().println("Post");
	}
	
	
	
	
	
}
