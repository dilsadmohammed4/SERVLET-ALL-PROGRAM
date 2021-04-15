
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AllServ extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String radio = request.getParameter("ReqRadio");
        if (radio.equals("Welcome")) {
            RequestDispatcher dis = request.getRequestDispatcher("WelcomeMessage");
            dis.forward(request, response);
        } else if (radio.equals("Sum")) {

            RequestDispatcher dis1 = request.getRequestDispatcher("sum.html");
            dis1.include(request, response);
            RequestDispatcher dis = request.getRequestDispatcher("SumNo");
            dis.forward(request, response);

        } else if (radio.equals("Address")) {
            RequestDispatcher dis = request.getRequestDispatcher("DisplayAddress");
            dis.forward(request, response);
        } else {
            out.print("Plese Select A Option To Perform Operation...");
            RequestDispatcher dis = request.getRequestDispatcher("index.html");
            dis.include(request, response);
        }
    }
}
