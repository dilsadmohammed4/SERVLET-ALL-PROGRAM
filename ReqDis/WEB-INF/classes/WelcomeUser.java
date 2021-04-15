import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeUser extends HttpServlet {

   public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

      try {
         int age = 21;
         String qualifi = "MCA";
         String name = request.getParameter("uname");
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
         out.println("<html><body>");
         out.println("<table><tr><td>Hello " + name + "</td></tr>");
         out.println("<tr><td>Age " + age + "</td></tr>");
         out.println("<tr><td>Qualification " + qualifi + "</td></tr>");
         out.println("</table></body></html>");

      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }

}