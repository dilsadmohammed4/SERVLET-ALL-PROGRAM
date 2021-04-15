import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class InStudentData extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int n = Integer.parseInt(request.getParameter("rollNo"));
        String p = request.getParameter("name");
        String e = request.getParameter("course");
        int c = Integer.parseInt(request.getParameter("mark"));

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "SYSTEM");
            PreparedStatement ps = con.prepareStatement("insert into Student values(?,?,?,?)");
            ps.setInt(1, n);
            ps.setString(2, p);
            ps.setString(3, e);
            ps.setInt(4, c);

            int i = ps.executeUpdate();
            if (i > 0)
                out.print("You are successfully registered...");

        } catch (Exception e2) {
            System.out.println(e2);
        }

        out.close();
    }

}