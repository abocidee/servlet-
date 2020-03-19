package cn.tedu;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get method d");
        ServletContext servletContext = getServletContext();
        //1 获取上下文参数
        String url = servletContext.getInitParameter("url");
        System.out.println(url);
        //2获取当前工程的工程路径
        String serverInfo = servletContext.getServerInfo();
        System.out.println(serverInfo);

        //3 获取实际路径
        String contextServlet = servletContext.getRealPath("/index.html");
        System.out.println(contextServlet);
    }
}
