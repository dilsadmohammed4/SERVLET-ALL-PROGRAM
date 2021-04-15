import java.io.*;
import java.io.ObjectInputFilter.Status;

import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;
import java.util.*;
import java.sql.*;

public class WelcomeServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter pw = response.getWriter();
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        String userpass = (String) session.getAttribute("userpass");
        String status = (String) session.getAttribute("stat");

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "SYSTEM");
            System.out.println(con);
            Statement st;
            st = con.createStatement();
            ResultSet rs;

            String query1 = "select First_name,Last_name,Status from PRegister where Email_id='" + username
                    + "'and Password='" + userpass + "'";
            rs = st.executeQuery(query1);
            pw = response.getWriter();
            while (rs.next()) {
                pw.println("<tr>");
                pw.println("<td><h3>Name: " + rs.getString(1) + " " + rs.getString(2) + "</h3></td>");
                pw.println("</tr>");
                pw.println("<tr>");
                pw.println("<td><h3>Status: " + rs.getString(3) + "</h3></td>");
                pw.println("</tr>");
            }
            rs.close();
            st.close();
            con.close();
            if (status.equals("User")) {

                pw.println("<form action='Calculate' method='post'> ");
                pw.println("  Product ID: <input type='text' name='pID'><br><br>");
                pw.println(" Brand Name: <input type='text' name='bName'><br><br>");
                pw.println("  Company Name: <input type='text' name='cName'><br><br>");
                pw.println("   Price: <input type='text' name='price'><br><br>");
                pw.println("   Catagory: <input type='text' name='cat'><br><br>");
                pw.println(" <input type='Submit' /></form> ");

            } else if (status.equals("Admin")) {

            }
            pw.println("</table></body></html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}