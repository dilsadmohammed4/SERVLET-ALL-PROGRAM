import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class PrintName extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html><body>");
        pw.println("Dilsad Mohammed.");
        pw.println("</br>");
        pw.println("7377983977");

        pw.println("</body></html>");

        pw.close();
    }
}