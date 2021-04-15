import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Check extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String rollNo = request.getParameter("rollNo");
        String name = request.getParameter("name");
        int fMark = Integer.parseInt(request.getParameter("fMark"));
        int sMark = Integer.parseInt(request.getParameter("sMark"));

        int per = (sMark * 100) / fMark;
        try {
            out.println("<html><body>");
            out.println("<table><tr><td>Roll No: " + rollNo + "</td></tr>");
            out.println("<table><tr><td>Name: " + name + "</td></tr>");
            out.println("<tr><td>Full Mark: " + fMark + "</td></tr>");
            out.println("<tr><td>Full Mark: " + sMark + "</td></tr>");
            if (per >= 50) {
                out.println("<tr><td>Passed The Exam...</td></tr>");
            } else {

                out.println("<tr><td>Failed The Exam...</td></tr>");
            }
            out.println("</table></body></html>");

        } catch (Exception e) {
            out.println(e.getMessage());
        }

    }
}
