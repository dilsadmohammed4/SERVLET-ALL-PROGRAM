import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;
import java.util.*;
import java.sql.*;

public class ThirdServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        String city = req.getParameter("city");
        String sal = req.getParameter("sal");

        HttpSession session = req.getSession();

        String name = (String) session.getAttribute("name");
        String addr = (String) session.getAttribute("Addr");
        String age = (String) session.getAttribute("age");
        String exp = (String) session.getAttribute("exp");
        String skils = (String) session.getAttribute("skils");

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "SYSTEM");
            System.out.println("connected to oracle");

            PreparedStatement pst = con.prepareStatement("INSERT INTO INFO VALUES(?,?,?,?,?,?,?)");

            pst.setString(1, name);
            pst.setString(2, addr);
            pst.setString(3, age);
            pst.setString(4, exp);
            pst.setString(5, skils);
            pst.setString(6, city);
            pst.setString(7, sal);

            int i = pst.executeUpdate();

            if (i > 0) {
                pw.println("<BODY BGCOLOR=cyan>");
                pw.println("<CENTER><H1><FONT COLOR=red>Successfully Inserted</FONT></H1></CENTER>");
                pw.println("<a href= personal.html>Home</a>");
                pw.println("</table></body>");
            } else {
                pw.println("<BODY BGCOLOR=cyan>");
                pw.println("<CENTER><H1><FONT COLOR=red>Try Again</FONT></H1></CENTER>");
                pw.println("<a href= personal.html>Home</a>");
            }
        } // try
        catch (Exception e) {
            e.printStackTrace();
            pw.println("<BODY BGCOLOR=cyan>");
            pw.println("<CENTER><H1><FONT COLOR=red>Try Again</FONT></H1></CENTER>");
            pw.println("<a href= personal.html>Home</a>");
        }
    } // service()
} // class