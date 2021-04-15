import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondSrv2 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw;
        // set content type and other response header fields first
        response.setContentType("text/html");
        // then write the data of the response
        pw = response.getWriter();
        // get values submitted by the form
        String income = request.getParameter("income");
        String tax = request.getParameter("tax");
        pw.println("<center><b><table border=1><tr>");
        pw.println("<td>Income:  " + income + "</td></tr>");
        pw.println("<tr><td>Tax   :  " + tax + "</td></tr>");
        // here we can use jdbc to store the values in database depend on your interst
        Cookie[] c = request.getCookies();
        if (c != null) {
            for (int i = 0; i < c.length; i++) {
                pw.println("<tr><td>" + c[i].getName() + "</td></tr><tr><td>" + c[i].getValue() + "</td></tr></table>");
            }
        }
        pw.println("</center>");
        pw.close();
    }
}