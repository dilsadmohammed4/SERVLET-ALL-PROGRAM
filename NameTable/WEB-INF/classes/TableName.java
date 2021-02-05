import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TableName extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        try {
            int m = Integer.parseInt(num1);
            int n = Integer.parseInt(num2);
            res.setContentType("text/html");
            String name = "Dilsad";
            PrintWriter out = res.getWriter();
            out.println("Row: " + m);
            out.println("Column: " + n);
            out.println("<HTML><BODY>");
            out.println("<table border=2>\n");

            for (int i = 1; i <= m; i++)

            {
                out.println("<tr>");

                for (int j = 1; j <= n; j++)

                {

                    out.println("<td>" + name + "</td>");

                }

                out.println("<tr>");

            }

            out.println("</table>");

            out.println("</BODY></HTML>");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}