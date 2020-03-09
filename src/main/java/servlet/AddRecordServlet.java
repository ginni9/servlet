package servlet;

import model.Record;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class AddRecordServlet extends HttpServlet {

    public static HashMap<String, Record> record1=new HashMap<String,Record>();
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
    {

        String rollNumber=req.getParameter("rollNumber");
        String name=req.getParameter("name");
        String universityName=req.getParameter("universityName");
        Record record=new Record(rollNumber,name,universityName);
        record1.put(rollNumber,record);
        res.getWriter().println("Record Added");



    }

}
