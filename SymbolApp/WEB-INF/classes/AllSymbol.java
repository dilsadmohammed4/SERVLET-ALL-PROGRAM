import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AllSymbol extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String sym = req.getParameter("sym");
        try {
            int i = Integer.parseInt(num1);
            int j = Integer.parseInt(num2);
            String k = sym;
            int m = 0;
            PrintWriter out = res.getWriter();
            if (k.equals("+")) {
                m = i + j;
                out.println("a+b=" + m);
            } else if (k.equals("-")) {
                m = i - j;
                out.println("a-b= " + m);
            } else if (k.equals("*")) {
                m = i * j;
                out.println("a*b= " + m);
            } else if (k.equals("/")) {
                double n = i / j;
                out.println("a/b= " + n);
            } else if (k.equals("%")) {
                double n = i % j;
                out.println("a%b= " + n);
            } else {

                out.println("Symbol is not Correct.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}