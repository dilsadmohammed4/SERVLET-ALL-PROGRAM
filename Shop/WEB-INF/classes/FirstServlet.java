import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class FirstServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String userpass = request.getParameter("userpass");

        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        session.setAttribute("userpass", userpass);

        if (LoginDao.validate(username, userpass)) {
            RequestDispatcher rd = request.getRequestDispatcher("servlet2");
            rd.forward(request, response);
        } else {
            out.print("Sorry username or password error");
            RequestDispatcher rd = request.getRequestDispatcher("login.html");
            rd.include(request, response);
        }

        out.close();
    }
}