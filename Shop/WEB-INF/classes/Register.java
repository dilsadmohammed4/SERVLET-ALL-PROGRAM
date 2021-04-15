import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

import java.sql.*;

public class Register extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        String id = request.getParameter("id");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String dob = request.getParameter("dob");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String pass = request.getParameter("pass");
        String status = request.getParameter("status");

        HttpSession session = request.getSession();
        session.setAttribute("stat", status);

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "SYSTEM");
            System.out.println("connected to oracle");

            PreparedStatement ps = con.prepareStatement("INSERT INTO PRegister VALUES(?,?,?,?,?,?,?,?)");

            ps.setString(1, id);
            ps.setString(2, pass);
            ps.setString(3, fname);
            ps.setString(4, lname);
            ps.setString(5, dob);
            ps.setString(6, email);
            ps.setString(7, mobile);
            ps.setString(8, status);

            int i = ps.executeUpdate();

            if (i > 0) {
                pw.println("<BODY BGCOLOR=cyan>");
                pw.println("<CENTER><H1><FONT COLOR=red>Successfully Inserted</FONT></H1></CENTER>");
                pw.println("<a href= register.html>Home</a>");
                pw.println("</table></body>");
            } else {
                pw.println("<BODY BGCOLOR=cyan>");
                pw.println("<CENTER><H1><FONT COLOR=red>Try Again</FONT></H1></CENTER>");
                pw.println("<a href= register.html>Home</a>");
            }

        }

        catch (Exception e) {
            e.printStackTrace();
            pw.println("<BODY BGCOLOR=cyan>");
            pw.println("<CENTER><H1><FONT COLOR=red>Try Again</FONT></H1></CENTER>");
            pw.println("<a href= register.html>Home</a>");
        }
    }
}