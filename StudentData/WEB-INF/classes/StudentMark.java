import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class StudentMark extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int roll = Integer.parseInt(request.getParameter("rollNo"));
        String name = request.getParameter("name");
        int math = Integer.parseInt(request.getParameter("math"));
        int eng = Integer.parseInt(request.getParameter("eng"));
        int java = Integer.parseInt(request.getParameter("java"));
        int dbms = Integer.parseInt(request.getParameter("dbms"));
        int os = Integer.parseInt(request.getParameter("os"));
        int total;
        int percentage;
        total = math + eng + java + dbms + os;
        percentage = (total * 100) / 500;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "SYSTEM");
            PreparedStatement ps = con.prepareStatement("insert into STUDENT_DATA values(?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, roll);
            ps.setString(2, name);
            ps.setInt(3, math);
            ps.setInt(4, eng);
            ps.setInt(5, java);
            ps.setInt(6, dbms);
            ps.setInt(7, os);
            ps.setInt(8, total);
            ps.setInt(9, percentage);

            int i = ps.executeUpdate();
            if (i > 0)
                out.print("You are successfully Inserted Records...");

        } catch (Exception e2) {
            System.out.println(e2);
        }

        out.close();
    }

}