import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletComm extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("t1") != null && request.getParameter("t1") != "") {
            int no = Integer.parseInt(request.getParameter("t1"));
            int res = no * no;

            request.setAttribute("message", "Hello The square value is: " + res);
        } else {
            request.setAttribute("message", "Enter valid data");
        }

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}