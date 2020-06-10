
package servlet;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import javax.servlet.*;
        import java.io.IOException;
        import java.io.Serializable;

public class FirstServlet implements Servlet, Serializable {
    private static final Logger  logger = LoggerFactory.getLogger(FirstServlet.class);

    private transient ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        logger.info("Servlet created");
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        logger.info("New request");
        servletResponse.getWriter().println("<h1>HELLO from the first servler !!!</h1>");
    }

    @Override
    public String getServletInfo() {
        return "Our first servlet";
    }

    @Override
    public void destroy() {
        logger.info("Servlet destroy");
    }
}
