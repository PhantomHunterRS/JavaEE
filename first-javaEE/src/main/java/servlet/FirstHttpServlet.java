package servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "FirstHttpServlet",urlPatterns = "/first_http_servlet/*")
public class FirstHttpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("test/html");
        resp.setCharacterEncoding("UTF-8");

        resp.getWriter().println("<h>FirstHttpServlet</h>");
        resp.getWriter().println("<p>contextPath: </p>" + getServletContext().getContextPath());
        resp.getWriter().println("<p>contextPath: </p>" + req.getContextPath());
        resp.getWriter().println("<p> servletPath: </p>" +req.getServletPath());
        resp.getWriter().println("<p> pathInfo: </p>" +req.getPathInfo());
        resp.getWriter().println("<p> queryString: </p>" +req.getQueryString());

        Enumeration<String> parameterNames = req.getParameterNames();
       while (parameterNames.hasMoreElements()){
           String name = parameterNames.nextElement();
           resp.getWriter().println("<p>" + name + " "+ req.getParameter(name)+ "</p>");

        }
    }
}
