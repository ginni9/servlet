package filter;


import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

public class IdFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out=servletResponse.getWriter();
        String rollNumber=servletRequest.getParameter("rollNumber");

        if(rollNumber.charAt(0)=='R' && rollNumber.charAt(1)=='N')
        {
            try
            {
                int number=Integer.parseInt(rollNumber.substring(2));
            }
            catch(NumberFormatException e)
            {
                out.println("Invalid RollNumber");

            }
            filterChain.doFilter(servletRequest,servletResponse);
        }
        else
        {
            out.println("Invalid RollNumber");
        }
    }

    @Override
    public void destroy() {

    }
}
