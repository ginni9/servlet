package filter;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;

public class responseFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
        PrintWriter out=servletResponse.getWriter();
        String accept=((HttpServletRequest)servletRequest).getHeader("Accept");
        Object Record=servletRequest.getAttribute("record");

        if(accept.equals("application/json")) {
            out.println(new Gson().toJson(Record));
        }
        else if(accept.equals("application/xml"))
            {
                XmlMapper xmlMapper = new XmlMapper();
                String xml = xmlMapper.writeValueAsString(Record);
                out.println(xml);
            }
        else
        {
            out.println(Record);
        }

    }

    @Override
    public void destroy() {

    }
}
