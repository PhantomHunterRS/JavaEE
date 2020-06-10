package servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

public class OrderServlet implements Servlet {
    private static final Logger logger = LoggerFactory.getLogger(OrderServlet.class);
    private transient ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        logger.info("Servlet OrderServlet created");
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        logger.info("New request");
        servletResponse.getWriter().println("<h1>Order !!!</h1>");
    }

    @Override
    public String getServletInfo() {
        return "Order servlet";
    }

    @Override
    public void destroy() {
        logger.info("Order Servlet destroy");
    }
}
