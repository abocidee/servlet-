package cn.tedu;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class lifecycleServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

        System.out.println("1 init");

       String servletname = servletConfig.getServletName();

     String name=   servletConfig.getInitParameter("name");

        ServletContext servletContext = servletConfig.getServletContext();

    }

    public ServletConfig getServletConfig() {
        System.out.println(" 2 servlet config");
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println(" 3 servlet service");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String method = request.getMethod();
        System.out.println("方法是" +method);

        ServletConfig servletConfig =getServletConfig();
        String servletname = servletConfig.getServletName();

        String name=   servletConfig.getInitParameter("name");

        ServletContext servletContext = servletConfig.getServletContext();
    }

    public String getServletInfo() {
        System.out.println("4 servlet info");
        return null;
    }

    public void destroy() {
        System.out.println(" 5 servet destroy");

    }
}
