package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AppContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent)
    {
        String servletContext=servletContextEvent.getServletContext().getInitParameter("parameters");
        try {
            Properties prop=readPropertiesFile(servletContext);
            System.out.println(prop);
            servletContextEvent.getServletContext().setAttribute("record" ,prop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
    public static Properties readPropertiesFile(String fileName) throws IOException
    {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch(FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }
        return prop;
    }
}
