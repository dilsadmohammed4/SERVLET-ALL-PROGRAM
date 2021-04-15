import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SumNo extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        int i = Integer.parseInt(num1);
        int j = Integer.parseInt(num2);
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            int sum = i + j;
            out.println("<html><body>");
            out.println("<table><tr><td>A: " + i + "</td></tr>");
            out.println("<tr><td>B: " + j + "</td></tr>");
            out.println("<tr><td>Sum: " + sum + "</td></tr>");
            out.println("</table></body></html>");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
