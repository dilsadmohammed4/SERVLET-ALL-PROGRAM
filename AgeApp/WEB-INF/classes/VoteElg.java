import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoteElg extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) {
        String name = req.getParameter("name");
        String num2 = req.getParameter("num");
        try {
            String i = name;
            int j = Integer.parseInt(num2);

            PrintWriter out = res.getWriter();
            out.println("Name: " + i);
            out.println("Age is: " + j);
            if (j >= 18) {
                out.println("Eligible For Voting.");
            } else {
                out.println("Not Eligible For Voting");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}