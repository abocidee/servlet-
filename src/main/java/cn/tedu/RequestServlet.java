package cn.tedu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
public class RequestServlet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String uri = request.getRequestURI();
		StringBuffer url = request.getRequestURL();
		String httpVersion = request.getProtocol();
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("uri="+uri+" url="+url
				+"http:"+httpVersion);
		
	}
	
}
