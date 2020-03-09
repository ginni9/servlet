package filter;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class NameFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String name=servletRequest.getParameter("name");
        PrintWriter out=servletResponse.getWriter();
        if(name.matches("^[a-zA-Z]*$"))
        {
            filterChain.doFilter(servletRequest,servletResponse);
        }
        else
        {
            out.println("Invalid name");
        }
    }

    @Override
    public void destroy() {

    }
}
