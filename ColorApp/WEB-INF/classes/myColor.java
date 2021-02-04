import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myColor extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name1");
        String color = req.getParameter("color");
        PrintWriter out = res.getWriter();
        out.println("Name:" + name);
        out.println("Favorite Color:" + color);

    }
}