import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayAddress extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html><body>");
            out.println("<table><tr><td>ADDRESS:</td></tr>");
            out.println("<table><tr><td>Lewis Rd</td></tr>");
            out.println("<tr><td>Plot:32DA</td></tr>");
            out.println("<tr><td>City:Bhubaneswar</td></tr>");
            out.println("<tr><td>Pin:751002</td></tr>");
            out.println("<tr><td>Odisha</td></tr>");
            out.println("</table></body></html>");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}