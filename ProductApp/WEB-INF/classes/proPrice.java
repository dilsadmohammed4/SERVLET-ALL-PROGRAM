import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class proPrice extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) {
        try {
            String name1 = req.getParameter("name1");
            String name2 = req.getParameter("name2");
            String price1 = req.getParameter("price1");
            String price2 = req.getParameter("price2");
            int i = Integer.parseInt(price1);
            int j = Integer.parseInt(price2);
            PrintWriter out = res.getWriter();
            out.println("Product 1: " + name1);
            out.println("Price: " + i);
            out.println("Product 2: " + name2);
            out.println("Price: " + j);
            int price = i + j;
            out.println("Total Price: " + price);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}