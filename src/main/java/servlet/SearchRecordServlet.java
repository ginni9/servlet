package servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SearchRecordServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out=res.getWriter();
        String rollNumber=req.getParameter("rollNumber");

        if(AddRecordServlet.record1.containsKey(rollNumber)) {
            req.setAttribute("record", AddRecordServlet.record1.get(rollNumber));
        }
        else
        {
            out.println("No Record Found");
        }



    }
}
