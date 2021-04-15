import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;
import java.util.*;
import java.sql.*;

public class Teacher extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        String branch = request.getParameter("branch");
        String subject1 = request.getParameter("subject1");
        String subject2 = request.getParameter("subject2");
        String salary = request.getParameter("salary");
        HttpSession session = request.getSession();
        String id = (String) session.getAttribute("id");
        String name = (String) session.getAttribute("name");
        String age = (String) session.getAttribute("age");
        String gender = (String) session.getAttribute("gender");
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "SYSTEM");
            System.out.println("connected to oracle");

            PreparedStatement ps = con.prepareStatement("INSERT INTO Teacher VALUES(?,?,?,?,?,?,?,?)");

            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, age);
            ps.setString(4, gender);
            ps.setString(5, branch);
            ps.setString(6, subject1);
            ps.setString(7, subject2);
            ps.setString(8, salary);

            int i = ps.executeUpdate();

            if (i > 0) {
                pw.println("<BODY BGCOLOR=cyan>");
                pw.println("<CENTER><H1><FONT COLOR=red>Successfully Inserted</FONT></H1></CENTER>");
                pw.println("<a href= index.html>Home</a>");
                pw.println("</table></body>");
            } else {
                pw.println("<BODY BGCOLOR=cyan>");
                pw.println("<CENTER><H1><FONT COLOR=red>Try Again</FONT></H1></CENTER>");
                pw.println("<a href= index.html>Home</a>");
            }

        }

        catch (Exception e) {
            e.printStackTrace();
            pw.println("<BODY BGCOLOR=cyan>");
            pw.println("<CENTER><H1><FONT COLOR=red>Try Again</FONT></H1></CENTER>");
            pw.println("<a href= index.html>Home</a>");
        }
    }
}