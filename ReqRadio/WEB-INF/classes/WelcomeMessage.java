import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeMessage extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            out.println("Welcome To Dilsad Servlet Program...");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}