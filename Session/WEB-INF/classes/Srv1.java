
// Shows how to store client state by using Hidden form fields
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Srv1 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw;
        // set content type and other response header fields first
        response.setContentType("text/html");
        // then write the data of the response
        pw = response.getWriter();
        // get values submitted by the form
        String name = request.getParameter("tname");
        String fname = request.getParameter("tfname");
        String mstatus = request.getParameter("ms");
        pw.println("<center><b>");
        try {
            if (mstatus.equals("single")) {
                pw.println("<form action='srv2' method='post'>");
                pw.println("When to marry <input type='text' name='t1'/><br>");
                pw.println("Why to marry <input type='text' name='t2'/><br>");
                // here we are writing the data back in the form as hidden fields.
                pw.println(" <input type=hidden name='tname' value =" + name + ">");
                pw.println(" <input type=hidden name='tfname' value =" + fname + ">");
                pw.println("<br><br><BR><BR><input type=submit  value = submit>");
                pw.println("</form>");
            } else {
                pw.println("<form action='srv2' method='post'>");
                pw.println("Spouse name <input type='text' name='t1'/><br>");
                pw.println("No of Children <input type='text' name='t2'/><br>");
                // here we are writing the data back in the form as hidden fields.
                pw.println(" <input type=hidden name='tname' value =" + name + ">");
                pw.println(" <input type=hidden name='tfname' value =" + fname + ">");
                pw.println("<br><br><BR><BR><input type=submit  value = submit>");
                pw.println("</form>");
            }
        }

        catch (Exception ee) {
            pw.println("Please Select Marital Details </center>");
        }
    }
}
