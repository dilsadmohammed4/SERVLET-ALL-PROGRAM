
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class Search extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            String qry, query1;
            qry = req.getParameter("t1");
            System.out.println(qry);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "SYSTEM");
            System.out.println(con);
            Statement st;
            st = con.createStatement();
            ResultSet rs;

            query1 = "select * from Student where Roll_no ='" + qry + "'";

            rs = st.executeQuery(query1);
            PrintWriter pw;
            pw = res.getWriter();
            pw.println("<html>");
            pw.println("<body>");
            pw.println("<table border=1>");
            pw.println("<tr>");
            pw.println("<th> ROLL NUMBER </th>");
            pw.println("<th> NAME </th>");
            pw.println("<th> COURSE </th>");
            pw.println("</tr>");
            while (rs.next()) {
                pw.println("<tr>");
                pw.println("<td>" + rs.getInt(1) + "</td>");
                pw.println("<td>" + rs.getString(2) + "</td>");
                pw.println("<td>" + rs.getString(3) + "</td>");
                pw.println("<td>" + rs.getInt(4) + "</td>");
                pw.println("</tr>");
            } // end of while loop
            rs.close();
            st.close();
            con.close();
            pw.println("</table></body></html>");
        } // end of try block
        catch (Exception e) {
            e.printStackTrace();
        } // end of catch block
    } // end of doGet()
}
