import javax.servlet.*;
import java.io.*;
public class MyFirstServlet extends GenericServlet
{
    public void service(ServletRequest req,ServletResponse resp)throws IOException,ServletException
    {
        PrintWriter out = resp.getWriter();
        out.print("hello and welcome to my first servlet program ");
    }
}