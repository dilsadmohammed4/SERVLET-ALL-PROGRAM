import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class table extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) {
        String num1 = req.getParameter("num1");
        try {
            int n = Integer.parseInt(num1);
            PrintWriter out = res.getWriter();
            out.println("Enter Number is: " + n);
            out.println("10's Table Is:");
            for (int i = 1; i <= 10; i++) {

                out.println(n + " * " + i + " = " + n * i);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}