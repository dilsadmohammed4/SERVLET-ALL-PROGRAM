import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenServ extends GenericServlet {

    public void service(ServletRequest request, ServletResponse response) {
        response.setContentType("text/html");
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Welcome to Generic Servlet</h1>");
            out.println("</body></html>");
            out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}