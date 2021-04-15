
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

import java.sql.*;

public class Calculate extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        String pID = request.getParameter("pID");
        String bName = request.getParameter("bName");
        String cName = request.getParameter("cName");
        String price = request.getParameter("price");
        String cat = request.getParameter("cat");

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "SYSTEM");
            System.out.println("connected to oracle");

            PreparedStatement ps = con.prepareStatement("INSERT INTO PProduct VALUES(?,?,?,?,?)");

            ps.setString(1, pID);
            ps.setString(2, bName);
            ps.setString(3, cName);
            ps.setString(4, price);
            ps.setString(5, cat);

            int i = ps.executeUpdate();

            if (i > 0) {
                pw.println("<BODY BGCOLOR=cyan>");
                pw.println("<CENTER><H1><FONT COLOR=red>Ordered Item</FONT></H1></CENTER>");
                pw.println("<H5><FONT COLOR=red>Price: " + price + "</FONT></H5></CENTER>");
                pw.println("<a href= login.html>Home</a>");

                pw.println("</table></body>");
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