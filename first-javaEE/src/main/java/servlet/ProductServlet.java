package servlet;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import javax.servlet.*;
        import java.io.IOException;
public class ProductServlet implements Servlet {
    private static final Logger logger = LoggerFactory.getLogger(ProductServlet.class);
    private transient ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        logger.info("Servlet ProductServlet created");
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        logger.info("New request");
        servletResponse.getWriter().println("<h1>Product !!!</h1>");
    }

    @Override
    public String getServletInfo() {
        return "Product servlet";
    }

    @Override
    public void destroy() {
        logger.info("Product Servlet destroy");
    }
}
