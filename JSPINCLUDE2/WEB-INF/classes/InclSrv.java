import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class InclSrv extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");
        pw.println("<br><br><b>This is from servelt program starting</b>");
        pw.println("<br><b>System Date and time is" + new java.util.Date());
        pw.println("<br><b> this is from servlet program end</b>");
    }
}