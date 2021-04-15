
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Show extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String pName = request.getParameter("pName");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int price = Integer.parseInt(request.getParameter("price"));
        int amount = Integer.parseInt(request.getParameter("amount"));
        try {
            out.println("<html><body>");
            out.println("<table><tr><td>Product Name: " + pName + "</td></tr>");
            out.println("<table><tr><td>Quantity: " + quantity + "</td></tr>");
            out.println("<tr><td>Price: " + price + "</td></tr>");
            out.println("<tr><td>Total Amount: " + amount + "</td></tr>");
            out.println("</table></body></html>");

        } catch (Exception e) {
            out.println(e.getMessage());
        }

    }
}