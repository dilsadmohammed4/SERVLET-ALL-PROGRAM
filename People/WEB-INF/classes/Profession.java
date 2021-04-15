import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Profession extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        String profession = request.getParameter("Profession");

        try {
            if (profession.equals("Teacher")) {
                pw.println("<form action='Teacher' method='post'>");
                pw.println("Branch<input type='text' name='branch'/><br>");
                pw.println("SUBJECT ONE <input type='text' name='subject1'/><br>");
                pw.println("SUBJECT SECOND <input type='text' name='subject2'/><br>");
                pw.println("Salary <input type='text' name='salary'/><br>");
                pw.println("<br><br><BR><BR><input type=submit  value = submit>");
                pw.println("</form>");

            } else if (profession.equals("Student")) {
                pw.println("<form action='Student' method='post'>");
                pw.println("Branch: <input type='text' name='branch'/><br>");
                pw.println("Duration: <input type='text' name='duration'/><br>");
                pw.println("Course-Fee: <input type='text' name='fee'/><br>");
                pw.println("<br><br><BR><BR><input type=submit  value = submit>");
                pw.println("</form>");
            } else {

            }
        }

        catch (Exception ee) {
            pw.println(ee.getMessage());
        }
    }
}