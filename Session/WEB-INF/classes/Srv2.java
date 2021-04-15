import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Srv2 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw;
        // set content type and other response header fields first
        response.setContentType("text/html");
        // then write the data of the response
        pw = response.getWriter();
        // get values submitted by the form
        String name = request.getParameter("tname");
        String fname = request.getParameter("tfname");
        String s1 = request.getParameter("t1");
        String s2 = request.getParameter("t2");
        // read 1st form Data
        pw.println("<center><b>Name: " + name);
        pw.println("<br><b> Father Name: " + fname);
        // read second form data
        pw.println("<br><b>Age: " + s1);
        pw.println("<br><b>" + s2);
    }
}
