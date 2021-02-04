
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNo extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        int i = Integer.parseInt(num1);
        int j = Integer.parseInt(num2);

        int k = i + j;
        PrintWriter out = res.getWriter();
        out.println("Sum is: " + k);
    }
}