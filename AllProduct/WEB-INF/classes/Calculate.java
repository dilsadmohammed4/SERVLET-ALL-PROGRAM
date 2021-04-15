import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Calculate extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String pName = request.getParameter("pName");
        String radio = request.getParameter("ReqRadio");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int price = Integer.parseInt(request.getParameter("price"));
        int amount = 0;
        if (radio.equals("FMCG")) {

            amount = quantity * (price + price * 12 / 100);
        } else if (radio.equals("Elctronics")) {

            amount = quantity * (price + price * 6 / 100);
        } else if (radio.equals("Gold")) {

            amount = quantity * (price + price * 3 / 100);
        } else if (radio.equals("Garment")) {

            amount = quantity * (price + price * 5 / 100);
        } else {

        }
        out.println("<form action='Show' method='post'>");
        out.println(" <input type=hidden name='pName' value =" + pName + ">");
        out.println(" <input type=hidden name='quantity' value =" + quantity + ">");
        out.println(" <input type=hidden name='price' value =" + price + ">");
        out.println(" <input type=hidden name='amount' value =" + amount + ">");
        out.println("<br><br><BR><BR><input type=submit  value = ShowDetails>");
        out.println("</form>");
    }
}