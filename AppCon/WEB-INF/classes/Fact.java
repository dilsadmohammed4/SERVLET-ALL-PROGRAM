import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class Fact extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            PrintWriter pw = res.getWriter();
            res.setContentType("text/html");
            ServletContext sc = getServletContext();
            String driver = sc.getInitParameter("driver");
            pw.println("Driver is : " + driver);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}